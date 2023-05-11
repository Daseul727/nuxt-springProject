<template>
  <div>
    <header style="margin-bottom: 20px;">
      <div id="nav">
        <nuxt-link to="/">HOME</nuxt-link> |
        <nuxt-link to="/user/login">LOGIN</nuxt-link> |
        <nuxt-link to="/user/join">JOIN</nuxt-link>
      </div>
      <hr/>
    </header>
    <nuxt/>
    <footer style="margin-top: 20px;">
      <hr/>
      <h3 style="margin-top: 20px;">footer 입니다.</h3>
    </footer>
  </div>
</template>
<script setup>
</script>


<style>

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}
</style>
