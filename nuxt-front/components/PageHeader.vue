<template>
  <header style="margin-bottom: 20px;">
    <div id="nav">
      <nuxt-link to="/">Home</nuxt-link> |
      <nuxt-link to="/user/login">LOGIN</nuxt-link> |
      <nuxt-link to="/user/join">JOIN</nuxt-link>
    </div>
    <hr/>
  </header>

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

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
