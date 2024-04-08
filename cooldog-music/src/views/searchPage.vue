<script setup lang="ts">
import {onMounted, ref} from "vue";
import {Search} from "@element-plus/icons-vue";
import {useRoute} from "vue-router";
import AMusic from "@/views/AMusic.vue";
const route = useRoute();
const activeName = ref('first')
const searchText = ref('')
onMounted(() => {
searchText.value= route.query.text
})
const datas=[
  {
    "name": "李健-啊夜曲",
    "zj": "李健的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  },
  {
    "name": "许嵩-灰色头像",
    "zj": "许嵩的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  },
  {
    "name": "李健-啊夜曲",
    "zj": "李健的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  },
  {
    "name": "许嵩-灰色头像",
    "zj": "许嵩的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  },
  {
    "name": "周杰伦-七里香",
    "zj": "周杰伦的专辑",
    "time": "4:32"
  }
]
</script>

<template>
  <div class="base-div">
    <div class="base-div" style="height: 120px;background-color:#f8f8f8;width: 100%;">
      <div class="mt-4">
        <el-input
            size="large"
            v-model="searchText"
            style="width: 500px"
            placeholder="Please input"
            class="input-with-select"
        >
          <template #append>
            <el-button :icon="Search"/>
          </template>
        </el-input>
      </div>
    </div>
  </div>
  <div class="base-div">
    <div style="width: 1000px;">
      <el-tabs v-model="activeName" class="demo-tabs" @tab-click="handleClick">
        <el-tab-pane label="单曲" name="first">
          <AMusic :table-data="datas"></AMusic>
        </el-tab-pane>
        <el-tab-pane label="歌单" name="second">Config</el-tab-pane>
        <el-tab-pane label="MV" name="third">Role</el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<style scoped>

</style>