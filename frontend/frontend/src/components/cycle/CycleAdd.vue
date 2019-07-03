<template>
    <div>
      <Nav></Nav>
       <form class="form-horizontal" @submit.prevent="regist">
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- modelname -->
      <label class="control-label"  for="modelname">모델명</label>
      <div class="controls">
        <input type="text" id="modelname" name="modelname" placeholder="" v-model="modelName" class="input-xlarge">
        
      </div>
    </div>
 
    <div class="control-group">
      <!-- sort -->
      <label class="control-label" for="sort">분류</label>
      <div class="controls">
        <input type="text" id="sort" name="sort" placeholder="" v-model="sort" class="input-xlarge">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- price-->
      <label class="control-label" for="price">대여가격</label>
      <div class="controls">
        <input type="text" id="price" name="price" placeholder="" v-model="price" class="input-xlarge">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- brand -->
      <label class="control-label"  for="brand">브랜드</label>
      <div class="controls">
        <input type="text" id="brand" name="brand" placeholder="" v-model="brand" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>

    <div class="control-group">
      <!-- gear -->
      <label class="control-label"  for="gear">기어수</label>
      <div class="controls">
        <input type="text" id="gear" name="gear" placeholder="" v-model="gear" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>

    
    <div class="control-group">
      <!-- brand -->
      <label class="control-label"  for="rent">대여유무</label>
      <div class="controls">
        <input type="text" id="rent" name="rent" placeholder="" v-model="rent" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <input type="submit" class="btn btn-success" @click="regist" value="등록">
      </div>
    </div>
  </fieldset>
</form>
      <Footer></Footer>
    </div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import CycleModify from'@/components/cycle/CycleModify.vue'
import { rename } from 'fs';
import axios from 'axios'
import {store} from '../../store'
import CycleList from '../cycle/CycleList'

export default {
    components:{
        Nav,Footer
    },
    data(){
       return {
              context: 'http://localhost:9000/cycles',
              modelName:'',
              sort:'',
              price:'',
              brand:'',
              gear:'',
              rent:''
       }
    },
    methods : {
        regist(){

          alert("모델명:" + this.modelName+ "분류:"+this.sort+ "대여가격:" +this.price+ 
          "브랜드:" +this.brand+ "기어수:" +this.gear+ "대여유무:" +this.rent);
        
        let headers = {'Content-Type' : 'application/json',
                       'Authorization' : 'JWT fefege..'}
        let data = {
               modelName : this.modelName,
               sort  : this.sort,
               price : this.price,
               brand : this.brand,
               gear  : this.gear,
               rent  : this.rent
        }      

        axios.post(`${this.context}`, JSON.stringify(data),{headers : headers})
        .then(res=>{
          alert('에러나지말아주세요')
          alert(`save() SUCCESS: ${res.data[0].brand}`)
            store.state.list = res.data
            this.$router.push("/CycleList")       
        })
        .catch(e=>{alert('ERROR')
        })

      
      },

    }
    

}
</script>

<style>

</style>
