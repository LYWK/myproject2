<template>

  <div class="hello">
      <Nav></Nav>
      
     <Footer></Footer>
    
  </div>
  
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from '@/components/common/Footer.vue'
export default {
  name: 'Home',
  components : {
      Nav, Footer
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

</style>
