<template>
<div>
<Nav></Nav>
    <table class="w3-table w3-bordered w3-striped w3-border test w3-hoverable">
      <tbody>
        <tr class="w3-green">
            <th>모델명</th>
            <th>분류</th>
            <th>대여가격</th>
            <th>브랜드</th>
            <th>기어수</th>
            <th>대여유무</th>
      </tr>
      </tbody>
      <tbody>
       <tr v-for="item in CycleList" v-bind:key="item.id">
            <td @click="detail(item)">{{item.modelName}}</td>
            <td>{{item.sort}}</td>
            <td>{{item.price}}</td>
            <td>{{item.brand}}</td>
            <td>{{item.gear}}</td>
            <td>{{item.rent}}</td>
             
      </tr>
  
      </tbody>
    </table>
    <Footer></Footer>
</div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'
import {store} from '../../store'
export default {
   data(){
     return {
        CycleList:[],
        context : 'http://localhost:9000/cycles'
     }
   },
   
  components: {
    Nav,
    Footer
  },
  created(){
        //  this.CycleList = store.state.list
        //  alert('store')
      
      axios.get(`${this.context}`).then((response)=>{
             console.log(response);
            this.CycleList = response.data;
         
        })
     
       },
  methods: {
    
       detail(item){
            alert("상세화면으로")
            store.state.id = item.id;
            store.state.modelName = item.modelName;
            store.state.sort = item.sort;
            store.state.price = item.price;
            store.state.brand = item.brand;
            store.state.gear = item.gear;
            store.state.rent = item.rent;
            alert(store.state.modelName);
            this.$router.push('/CycleDetail') 

       }
     // this.$router.link(-1);
   }
  }

</script>
<style scoped>

</style>