<template>
    <div>
      <Nav></Nav>
<div class="container">
   <table  class="w3-table w3-bordered w3-striped w3-border test w3-hoverable">
  <tr>
      <th  scope="col">모델명</th>
      <td>
                <!-- modelname -->
      {{this.$store.state.modelName}}
      </td>
  </tr>
  <tr>
       <th  scope="col">분류</th>
      <td>
                    <!-- sort -->
      {{this.$store.state.sort}}
      </td>
  </tr>
  <tr>
       <th  scope="col">대여가격</th>
      <td>
                <!-- price-->
      {{this.$store.state.price}}
      </td>
  </tr>
  <tr>
       <th  scope="col">브랜드</th>
      <td>
            <!-- brand -->
      {{this.$store.state.brand}}
      </td>
  </tr>
  <tr>
       <th  scope="col">기어수</th>
      <td>
                <!-- gear -->
      {{this.$store.state.gear}}
      </td>
  </tr>
    <tr>
        <th  scope="col">대여여부</th>
        <td>
        <!-- rent -->
        {{this.$store.state.rent}}
        </td>
    </tr>
    <tr>
        
            <td style="width:85%"><router-link to="/CycleModify">수정</router-link> | <span class="link" @click="deleteboard">삭제</span></td> 
        
    </tr>
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

         }
    },
    components:{
        Nav,Footer
    },
    methods:{
        deleteboard(e){
            e.preventDefault();
              let headers = {
                'Content-Type': 'application/json',
                'Authorization' : 'JWT fefege..'
              }
            alert("id: "+this.$store.state.id)
        
            axios.delete(`${this.context}/${this.$store.state.id}`, {headers:headers})
                    .then(res=>{
                        alert(`delete성공 : ${res.result}`)
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
