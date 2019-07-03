<template>
    <div>
      <Nav></Nav>
       <form class="form-horizontal" action='' method="POST">
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- modelname -->
      <label class="control-label"  for="modelname">모델명</label>
      <div class="controls">
        <input type="text" id="modelname" name="modelname" placeholder="" class="input-xlarge">
        
      </div>
    </div>
 
    <div class="control-group">
      <!-- sort -->
      <label class="control-label" for="sort">분류</label>
      <div class="controls">
        <input type="text" id="sort" name="sort" placeholder="" class="input-xlarge">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- price-->
      <label class="control-label" for="price">대여가격</label>
      <div class="controls">
        <input type="text" id="price" name="price" placeholder="" class="input-xlarge">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- brand -->
      <label class="control-label"  for="brand">브랜드</label>
      <div class="controls">
        <input type="text" id="brand" name="brand" placeholder="" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>

    <div class="control-group">
      <!-- gear -->
      <label class="control-label"  for="gear">기어수</label>
      <div class="controls">
        <input type="text" id="gear" name="gear" placeholder="" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>

    
    <div class="control-group">
      <!-- brand -->
      <label class="control-label"  for="rent">대여유무</label>
      <div class="controls">
        <input type="text" id="rent" name="rent" placeholder="" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">Register</button>
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
export default {
    components:{
        Nav,Footer
    }
}
</script>
<style>

</style>
