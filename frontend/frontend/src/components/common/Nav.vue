<template>
    <div class="bg">
      <nav class="navbar navbar-default">
      
        <div class="container-fluid">
          <div class="navbar-header">           
            <a class="navbar-brand" href="#">Home</a>  
          </div>
          <b-nav tabs align="center" style="font-size:15px;"> 
            <b-nav-item><router-link to="/">RENCYCLE</router-link></b-nav-item>
            <b-nav-item><router-link to="/CycleAdd">자전거출고</router-link></b-nav-item>
            <b-nav-item><router-link to="/CycleList">자전거목록</router-link></b-nav-item>
          </b-nav>
        </div>
      </nav>
    </div>    
</template>
<script>
export default {
    
}
</script>
<style scoped>
nav{background:black}
.navbar-brand{line-height:4;}

</style>

