<script setup lang="ts">
import {Search, ArrowRight} from '@element-plus/icons-vue'
import {onMounted, ref} from "vue";
import axios from "axios";

const getData = () => {
  axios({
    method: 'get',
    url: '/api/home_4picture'
  }).then(res => {
    refList.value=res.data
  })
}
const refList = ref([])
onMounted(()=>{
  getData()
})
</script>

<template>
  <div>
    <el-carousel height="500px">
      <el-carousel-item v-for="item in 4">
        <img width="100%" height="100%" src="https://imgessl.kugou.com/commendpic/20221012/20221012151556309954.jpg"/>
      </el-carousel-item>
    </el-carousel>
    <div class="download">
      <text class="mid-btn">
        下载电脑版
      </text>
      <text class="mid-btn">
        下载IPhone版
      </text>
      <text class="mid-btn">
        下载Android版
      </text>
    </div>
    <div class="base-div">
      <div style="width: 1000px;display:flex;">
        <div style="width: 640px;margin-right: 40px;">
          <el-card shadow="never" style="width: 100%;margin-top: 20px">
            <el-row>
              <el-col :span="6">
                <h1>精选歌单</h1>
              </el-col>
              <el-col :span="12">
              </el-col>
              <el-col :span="6">
                <div class="align-rightBottom" style="width: 100%;margin-top: 10px;">
                  更多
                  <el-icon :size="18">
                    <ArrowRight/>
                  </el-icon>
                </div>
              </el-col>
              <el-col :span="13">
                <img
                    src="https://imgessl.kugou.com/custom/480/20221121/20221121235623989334.jpg"
                    style="width: 320px"
                />
                <p style="width: 100%;text-align: left;padding-left: 20px">MC DEAR JANE 张天赋</p>
              </el-col>
              <el-col :span="11">
                <div style="width: 100%;">
                  <el-row>
                    <el-col v-for="(item,index) in refList" :key="index" :span="12">
                      <img
                          :src="item.url"
                          style="width: 130px;"
                      />
                      <p>{{ item.title }}</p>
                    </el-col>
                  </el-row>
                </div>
              </el-col>
            </el-row>
          </el-card>
        </div>
        <div style="width: 320px">
          <el-card shadow="never" style="width: 100%;margin-top: 20px">
            <el-row>
              <el-col :span="18">
                <div class="align-left">
                  <h1>热门榜单</h1>
                </div>
              </el-col>
              <el-col :span="6">
                <div class="align-rightBottom" style="width: 100%;margin-top: 10px;">
                  更多
                  <el-icon :size="18">
                    <ArrowRight/>
                  </el-icon>
                </div>
              </el-col>
              <el-col :span="8">
                <img width="110px" src="https://www.kugou.com/common/images/rank_i1.png">
              </el-col>
              <el-col :span="16">
                <div class="base-div" style="justify-content: flex-start;height: 100%;">
                  <ol>
                    <li></li>
                    <li></li>
                    <li></li>
                  </ol>
                </div>
              </el-col>
            </el-row>
          </el-card>
        </div>

      </div>
    </div>
  </div>
</template>
<style>
.download {
  -webkit-text-size-adjust: none;
  -webkit-user-select: none;
  font-family: \5FAE\8F6F\96C5\9ED1, simsun, sans-serif;
  margin: 0;
  padding: 0;
  z-index: 20;
  top: 580px;
  display: flex;
  -webkit-box-pack: center;
  justify-content: center;
  -webkit-box-align: center;
  align-items: center;
  width: 100%;
  position: absolute;
  height: 60px;
  backdrop-filter: saturate(180%) blur(6px);
  background: rgba(255, 255, 255, 0.5);
}

.mid-btn {
  cursor: pointer;
  color: #000;
  width: 260px;
  font-weight: 400;
}

h1 {
  -webkit-text-size-adjust: none;
  -webkit-user-select: none;
  font-family: \5FAE\8F6F\96C5\9ED1, simsun, sans-serif;
  margin: 0;
  padding: 0;
  font-size: 26px;
  font-weight: 500;
  color: #000000;
  height: 60px;
}

.el-card__header {
  height: 60px !important;
  padding: 0 !important;
}

.el-card__body {
  padding: 0 !important;
}

.el-main {
  line-height: normal !important;
}

.el-card {
  border: none;
}

img {
  border-radius: 10px;
}

p {
  font-size: 14px;
  font-weight: 400;
  color: #000000;
  display: block;
  width: 130px;
  word-break: break-all !important;
  overflow: hidden;
  -o-text-overflow: ellipsis;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}
</style>