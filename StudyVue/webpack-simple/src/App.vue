<template lang="html">
  <div id="app">
     App 컴포넌트<br>
     <input id="calendar">
  </div>
</template>

<script>
//window.$ = window.jQuery = window.jquery = require('jquery');
import $ from 'jquery';
//import $ from 'jquery-ui';
import Vue from 'vue'
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
window.$ = window.jQuery = require('jquery-ui');
//window.$ = window.jQuery = require('moment');
//Vue.use(BootstrapVue)
//Vue.use(BootstrapVueIcons)
export default {

  name: 'App.vue',
  created() {
    // var version = $.ui ? $.ui.version || "pre 1.6" : 'jQuery-UI not detected';
    console.log($.fn.jquery);
    console.log($.ui.version);
  },
  mounted() {
    $('#calendar').datepicker();
  }
}
</script>

<style lang="css" scoped>
</style>
