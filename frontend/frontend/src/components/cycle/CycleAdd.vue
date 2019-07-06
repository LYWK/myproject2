<template>
    <div>
      <!-- @submit.prevent="regist" -->
      <Nav></Nav>
  <b-container fluid>    
    <form class="form-horizontal" @submit.prevent="regist">
    <div id="legend" style="font-size: 20px;">
      <legend class="">자전거등록</legend>
    </div>
    <div style="font-size: 15px; color:black; text-align:center;">
    <!-- modelname -->
    <b-row class="my-1">
      <b-col sm="3">
      <label class="control-label"  for="modelname">모델명</label>
      </b-col>
      <b-col sm="9">
        <b-form-input  v-model="modelName" ></b-form-input>
      </b-col>
    </b-row>

    <!-- sort -->
    <b-row class="my-1">
      <b-col sm="3">
      <label class="control-label" for="sort">분류</label></b-col>
      <b-col sm="9">
        <!-- <b-form-input  v-model="sort" class="input-xlarge"></b-form-input> -->
        <b-form-select v-model="sort" :options="options1" style="font-size:15px;"></b-form-select>
      </b-col>
    </b-row>
    
    <!-- price-->
    <b-row class="my-1">
      <b-col sm="3">
      <label class="control-label" for="price">대여가격</label></b-col>
      <b-col sm="9">
        <b-form-input  v-model="price" class="input-xlarge" ></b-form-input>
      </b-col>
    </b-row>

    <!-- brand -->
    <b-row class="my-1">
      <b-col sm="3">  
      <label class="control-label"  for="brand">브랜드</label></b-col>
       <b-col sm="9">
        <b-form-input  v-model="brand" class="input-xlarge"></b-form-input>
      </b-col>
    </b-row>

    <!-- gear -->
    <b-row class="my-1">
      <b-col sm="3">  
      <label class="control-label"  for="gear">기어수</label></b-col>
      <b-col sm="9">
        <!-- <b-form-input  v-model="gear" class="input-xlarge"></b-form-input> -->
        <b-form-select v-model="gear" :options="options2" style="font-size:15px;"></b-form-select>
     </b-col>
    </b-row>

     <!-- brand -->
    <b-row class="my-1">
      <b-col sm="3">  
      <label class="control-label"  for="rent">대여유무</label></b-col>
      <b-col sm="9">
        <b-form-select v-model="rent" :options="options" style="font-size:15px;"></b-form-select>
        <!-- <b-form-input  v-model="rent" class="input-xlarge"></b-form-input> -->
      </b-col>
    </b-row>
 
    <!-- Button -->
    <div class="control-group">
      <div class="controls">
        <b-button type="submit"   variant="primary">등록</b-button>
        <b-button type="reset"   variant="danger">취소</b-button>
      </div>
    </div>
    </div>
    </form>
  </b-container>

      <Footer></Footer>
    </div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'

import { rename } from 'fs';
import axios from 'axios'
import {store} from '../../store'


export default {
    components:{
        Nav,Footer
    },
    data(){
       return {
            rent: null,
            options : [
            { value: null, text: '선택하세요' },
            { value: '대여가능', text: '대여가능' },
            { value: '대여가능', text: '대여불가' },
            ],
            sort: null,
            options1 : [
            { value: null, text: '선택하세요' },
            { value: 'MTB', text: 'MTB' },
            { value: '로드바이크', text: '로드바이크' },
            { value: '미니벨로', text: '미니벨로' },
            ],
            gear: null,
            options2 : [
            { value: null, text: '선택하세요' },
            { value: '7단', text: '7단' },
            { value: '21단', text: '21단' },
            { value: '27단', text: '27단' },
            ],
              context: 'http://localhost:9000/cycles',
              modelName:'',
              // sort:'',
              price:'',
              brand:'',
              //gear:'',
              //rent:''
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
          // alert('에러나지말아주세요')
          // alert(`save() SUCCESS: ${res.data[0].brand}`)
            store.state.list = res.data
             
            this.$router.push("/CycleList")   
             
        })
        .catch(e=>{alert('ERROR')
        })
      }
    }

   }
</script>

<style scoped>
   legend{
     font-size: 20px;
     color: black;
   }
   b-button{
      font-size: 20px;
   }
</style>

