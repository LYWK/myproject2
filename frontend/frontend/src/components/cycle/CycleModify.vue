<template>
    <div>
      <Nav></Nav>
 <div class="container">
   <table  class="container">
  <tr>
      <td>모델명</td>
      <td>
                <!-- modelname -->
          {{this.$store.state.modelName}}
      </td>
  </tr>
  <tr>
       <td>분류</td>
      <td>
                    <!-- sort -->
           {{this.$store.state.sort}}
      </td>
  </tr>
  <tr>
       <td>대여가격</td>
      <td>
                <!-- price-->
          <input type="text" id="price" name="price" placeholder="" v-model="price" class="input-xlarge">
      </td>
  </tr>
  <tr>
       <td>브랜드</td>
      <td>
            <!-- brand -->
      {{this.$store.state.brand}}
      </td>
  </tr>
  <tr>
       <td>기어수</td>
      <td>
                <!-- gear -->
       <input type="text" id="gear" name="gear" placeholder="" v-model="gear" class="input-xlarge">
      </td>
  </tr>
    <tr>
        <td>대여여부</td>
        <td>
        <!-- rent -->
         <input type="text" id="rent" name="rent" placeholder="" v-model="rent" class="input-xlarge">
        </td>
    </tr>
        <input type="button" style="float:right" class="btn btn-outline-secondary btn-sm" value="수정완료" @click="updatego">        

   </table>
      
       
    </div>
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
         return{
             context : 'http://localhost:9000/cycles',
             
            
             price : store.state.price,
             gear : store.state.gear,
             rent : store.state.rent

         }
    },
    components:{
        Nav,Footer
    },
    methods:{
         updatego(e){
               e.preventDefault();
               alert('수정하러 고')
              let data = {
               
                      price : this.price,
                      gear : this.gear,
                      rent : this.rent  
              }
              let headers = {
                'Content-Type': 'application/json',
                'Authorization' : 'JWT fefege..'
              }
            alert("id: "+this.$store.state.id)
            alert("updatego price: "+data.price)
            alert("updatego gear: "+data.gear)
            alert("updatego rent: "+data.rent)

            axios.put(`${this.context}/${this.$store.state.id}`, JSON.stringify(data), {headers:headers})
                    .then(res=>{
                        alert(`update성공 : ${res.result}`)
                        this.$router.push("/CycleList")
                        // this.$router.link(-1);
                    })
                    .catch(e=>{
                        alert('에러')
                    })
        
      }
    }
}
</script>
<style>

</style>
