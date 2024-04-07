<script setup lang="ts">
import {ref} from "vue";
import {routes} from '@/router/routes'
import router from "@/router";
const activeIndex=ref('/home')
const selectMenu = (key: string, keyPath: string[]) => {
  activeIndex.value=key
  console.log(activeIndex.value)
}
</script>

<template>
  <div class="headMenu">
    <el-menu :default-active="activeIndex" :active-text-color="'#fff'" :collapse-transition="false" mode="horizontal" :show-timeout="0" :hide-timeout="0" @select="selectMenu">
      <el-menu-item @click="router.push({path: item.path})" v-for="item in routes" :class="{selected: activeIndex===item.path}" :index="item.path"><a>{{item.title}}</a></el-menu-item>
      <el-menu-item index="5"><a>下载酷狗</a></el-menu-item>
      <el-menu-item index="6"><a>商务合作</a></el-menu-item>
    </el-menu>
  </div>
</template>

<style scoped>
.headMenu{
  height: 100%;
}
.selected{
  width: 94px;
  height: 34px !important;
  display: flex;
  align-items: center;
  justify-content: center;
  font-weight: 600 !important;
  background-color: #00a9ff !important;
  border-radius: 18px;
}

a{
  width: 94px;
  height: 34px !important;
  display: flex;
  align-items: center;
  justify-content: center;
  font-weight: 400;
  border-radius: 18px;
}

li{
  border-bottom: none !important;
  height: 60px !important;

}
ul{
  display: flex;
  align-items: center;
  justify-content: center;
}
.el-menu--horizontal>.el-menu-item a, .el-menu--horizontal>.el-menu-item a:hover {
  font-weight: 600;
}
</style>