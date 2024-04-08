<template>
  <div class="base-div">
    <div class="about">
      <el-card shadow="never">
        <template #header>
          <div style="width: 1000px">
            <div style="width: 1000px;display: flex;justify-content: space-between;align-items: flex-end;">
              <el-row style="width: 100%!important;">
                <el-col :span="4">
                  <h1 style="margin-top: 20px;">酷狗飙升榜</h1>
                </el-col>
                <el-col :span="5">
                  <h2 style="margin-top: 30px;font-size: 14px;color:#999;">2024-4-8 更新</h2>
                </el-col>
              </el-row>
            </div>
          </div>
        </template>
        <el-table :data="musicList" :header-cell-style="{ display:'none'}">
          <el-table-column type="index" width="50" />
          <el-table-column prop="name" label="Name" width="900px" />
          <el-table-column prop="time" label="time" width="100px" />
        </el-table>
        <template #footer>
          <div>查看更多内容,请下载客户端</div><el-button type="primary">立即下载</el-button>
        </template>
      </el-card>
    </div>

  </div>
</template>
<style scoped>

</style>
<script setup lang="ts">
import {onMounted, ref} from "vue";
import axios from "@/server/axios";
const selectMusic = () => {
  axios({
    method: 'get',
    url: '/api/music'
  }).then(res => {
    musicList.value = res.data.data
  })
}
const musicList = ref([

])
onMounted(()=>{
  selectMusic()
})
</script>