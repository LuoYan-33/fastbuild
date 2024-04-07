<script setup lang="ts">
import Top from "@/components/layout/components/top.vue";
import headMenu from "@/components/layout/components/headMenu.vue";
</script>

<template>
  <div>
    <top></top>
    <el-container>
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
