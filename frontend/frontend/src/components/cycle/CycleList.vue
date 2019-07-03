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
       <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td><button>삭제</button></td>
            <td><router-link to="/CycleModify">정보수정</router-link></td>
      </tr>
  
      <tr>
        <td>4</td>
        <td></td>
        <td></td>
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

export default {
  components: {
    Nav,
    Footer
  },
  methods: {
      created(){
           axios.get(`${this.context}`)
        .then(res=>{
         this.boardlist =  res.data;
          
        })
      }
  }
}
</script>
<style scoped>

</style>