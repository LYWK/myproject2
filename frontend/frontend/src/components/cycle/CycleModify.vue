<template>
    <div>
      <Nav></Nav>
 <div style="font-size: 15px; color:black; text-align:center;">
   <table  class="w3-table w3-bordered w3-striped w3-border test w3-hoverable" style="width: 25%; margin: 0 auto">
  <tr>
      <th class="w3-green">모델명</th>
      <td>
                <!-- modelname -->
          {{this.$store.state.modelName}}
      </td>
  </tr>
  <tr>
       <th class="w3-green">분류</th>
      <td>
                    <!-- sort -->
           {{this.$store.state.sort}}
      </td>
  </tr>
  <tr>
       <th class="w3-green">대여가격</th>
      <td>
                <!-- price-->
          <input type="text" id="price" name="price" placeholder="" v-model="price" class="input-xlarge">
      </td>
  </tr>
  <tr>
       <th class="w3-green">브랜드</th>
      <td>
            <!-- brand -->
      {{this.$store.state.brand}}
      </td>
  </tr>
  <tr>
       <th class="w3-green">기어수</th>
      <td>
                <!-- gear -->
       <!-- <input type="text" id="gear" name="gear" placeholder="" v-model="gear" class="input-xlarge"> -->
        <b-form-select v-model="gear" :options="options2" style="font-size:15px;"></b-form-select>
      </td>
  </tr>
    <tr>
        <th class="w3-green">대여여부</th>
        <td>
        <!-- rent -->
         <!-- <input type="text" id="rent" name="rent" placeholder="" v-model="rent" class="input-xlarge"> -->
          <b-form-select v-model="rent" :options="options3" style="font-size:15px;"></b-form-select>
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
             
            gear: store.state.gear,
            options2 : [
            { value: null, text: '선택하세요' },
            { value: '7단', text: '7단' },
            { value: '21단', text: '21단' },
            { value: '27단', text: '27단' },
            ],
            rent: store.state.rent,
            options3 : [
            { value: null, text: '선택하세요' },
            { value: '대여가능', text: '대여가능' },
            { value: '대여불가', text: '대여불가' }
            ],
             price : store.state.price
            

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
