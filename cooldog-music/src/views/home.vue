<script setup lang="ts">
import { Search,ArrowRight } from '@element-plus/icons-vue'
</script>

<template>
  <div>
    <el-carousel height="500px">
      <el-carousel-item v-for="item in 4" :key="item">
        <img width="100%" height="100%" src="https://imgessl.kugou.com/commendpic/20221012/20221012151556309954.jpg" />
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
                <div class="align-rightBottom" style="width: 100%;">
                  更多<el-icon :size="18"><ArrowRight /></el-icon>
                </div>
              </el-col>
              <el-col :span="8">
                <img
                    src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                    style="width: 100%"
                />
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
                <div class="align-rightBottom" style="width: 100%;">
                  更多<el-icon :size="18"><ArrowRight /></el-icon>
                </div>
              </el-col>
              <el-col :span="8">
                <img
                    src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                    style="width: 100%"
                />
              </el-col>
            </el-row>
          </el-card>
        </div>

      </div>
    </div>
  </div>
</template>
<style>
.download{
  -webkit-text-size-adjust: none;
  -webkit-user-select: none;
  font-family: \5FAE\8F6F\96C5\9ED1,simsun,sans-serif;
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
.mid-btn{
  cursor: pointer;
  color: #000;
  width: 260px;
  font-weight: 400;
}
h1{
  -webkit-text-size-adjust: none;
  -webkit-user-select: none;
  font-family: \5FAE\8F6F\96C5\9ED1,simsun,sans-serif;
  margin: 0;
  padding: 0;
  font-size: 26px;
  font-weight: 500;
  color: #000000;
  height: 60px;
}
.el-card__header{
  height: 60px !important;
  padding: 0 !important;
}
.el-main{
  line-height: normal !important;
}
.el-card{
  border: none;
}
</style>