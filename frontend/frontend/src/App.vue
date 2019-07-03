<template>
  <div id="app" class="bg">
     <!-- <img src="./assets/logo.png">  -->
 
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
body, html {
  height: 100%;
}
.bg {
  /* The image used */
  background-image: url("https://www.ifez.go.kr/humanframe/theme/tour/assets/images/content/img_cycle.jpg");

  /* Full height */
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

</style>
