<template>
    <div>
      <nav class="navbar navbar-default">
        <img src="@/assets/dd.png">
        <div class="container-fluid">
        <div class="navbar-header">
        <a class="navbar-brand" href="#">Home</a>  
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><router-link to="/">RENCYCLE</router-link></li>
      <li><router-link to="/CycleAdd">자전거입고</router-link></li>
      <li><router-link to="/CycleList">자전거목록</router-link></li>
     
    </ul>
    </div>
      </nav>
    </div>    
</template>
<script>
export default {
    
}
</script>
<style>

</style>
