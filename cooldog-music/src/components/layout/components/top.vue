<template>
  <div style="z-index: 999" class="cmhead1">
    <div class="cmhead2">
      <img style="width: 146px;height: 38px;margin-right: 40px;" src="@/components/icons/kugou_white.png">
      <topleft @Search="onSearch"></topleft>
      <div>
        <el-link>加入我们</el-link>
        <el-link>关于公司</el-link>
        <el-divider direction="vertical"></el-divider>
        <el-link style="margin-left: 30px;margin-right: 0;">
          <el-button style="width: 90px;height: 30px;border-radius: 15px;color:#00A9FF;font-size: 16px">登录</el-button>
        </el-link>
      </div>
      <div></div>
    </div>
  </div>
</template>
<script setup lang="ts">
import {Search, ArrowRight} from '@element-plus/icons-vue'
import {ref} from "vue";
import Topleft from "@/components/layout/components/topleft.vue";
import router from "@/router/index.js";

const onSearch = (text: string) => {
  console.log(text)
  router.push({
    path: "/search",
    query: {
      text: text
    }
  })
}
</script>
<style scoped>
.cmhead1 {
  background-color: rgba(0, 169, 255, 0);
  min-height: 60px;
  width: 100%;
}

.cmhead2 {
  width: 100%;
}

div {
  display: flex;
  justify-content: center;
  align-items: center;
}

.search {
  width: 280px;
  height: 30px;
  border-radius: 10px;
}

/deep/ .el-input__wrapper { /*或者 .s2>>>.el-input__inner  */
  background: #4dc2ff; /*调整inner的背景色，透明*/
  border: none;
  border-radius: 31px; /*输入框圆角值*/
  box-shadow: none !important;
  color: #fff !important;
}

/deep/ .el-input__inner {
  color: #fff !important;
}

/deep/ .el-icon svg {
  color: #fff !important;
}

/deep/ .el-link {
  color: #fff;
  margin-right: 30px;
}
</style>