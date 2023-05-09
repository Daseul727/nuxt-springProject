<template>
  <div>
    <page-header/>

    <page-footer/>
  </div>
</template>


<script>
import AppLogo from '~/components/AppLogo.vue'
import PageFooter from "~/components/PageFooter.vue";
import PageHeader from "~/components/PageHeader.vue";
export default {
  components: {
    PageHeader,
    PageFooter
  }
}
</script>
