<script setup lang="ts">
import Top from "@/components/layout/components/top.vue";
import headMenu from "@/components/layout/components/headMenu.vue";
</script>

<template>
  <div style="position: relative">
    <el-container style="position: relative">
      <top style="z-index: 99;position: fixed;top: 0;order: 1;"></top>
      <img style="position:absolute;top: -60px;z-index: 98;" src="https://static.ixiaochuan.cn/planck-web/67e2de54815e12ab8bab.png">
      <el-header>
        <template #default>
          <headMenu></headMenu>
        </template>
      </el-header>
      <el-main>
        <template #default>
          <router-view></router-view>
        </template>
      </el-main>
    </el-container>
  </div>
</template>

<style scoped>
.el-container {
  height: 100% !important;
  width: 100vw !important;
}

.el-header,
.el-footer {
  height: 60px;
  text-align: center;
  padding: 0;
}


.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  line-height: 160px;
  padding: 0;
}

.el-menu {
  background-color: #d3dce6;
}
</style>
