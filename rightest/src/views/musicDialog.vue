<script setup lang="ts">
const props = defineProps({
  myVisible: {
    type: Boolean,
    default: false
  },
  title: {
    type: String,
    default: ''
  }
})
const emit = defineEmits(['close'])
</script>

<template>
  <el-dialog style="background-color:#f0f0f0;" :width="600" :title="title" v-model="props.myVisible" :before-close="()=>{emit('close')}">
    <el-scrollbar height="400px">
    <div class="base-div" style="width: 100%;background-color:#f0f0f0;">
      <div class="jspPane" style="padding: 0px; top: -204px;font-size: 16px !important;"><p class="ie8FontColor">
      </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor">
        </p>
        <p class="ie8FontColor playOver">
        </p>
        <p class="ie8FontColor">Now you got blazin'
        </p>
        <p class="ie8FontColor">I'll take you to the higher stage
        </p>
        <p class="ie8FontColor">男rap：I'll take you to the higher stage
        </p>
        <p class="ie8FontColor">Now you got blazin'
        </p>
        <p class="ie8FontColor">男：涙を隠した
        </p>
        <p class="ie8FontColor">強がりな君の笑顔
        </p>
        <p class="ie8FontColor">肩を抱くことさえ
        </p>
        <p class="ie8FontColor">素直には出来なくて
        </p>
        <p class="ie8FontColor">夜明けの向こうに
        </p>
        <p class="ie8FontColor">どんな未来があっても
        </p>
        <p class="ie8FontColor">信じることでしか
        </p>
        <p class="ie8FontColor">変えられない
        </p>
        <p class="ie8FontColor">女：見失っていた魂のカケラ
        </p>
        <p class="ie8FontColor">二人で探し当てた 瞬間
        </p>
        <p class="ie8FontColor">きっと
        </p>
        <p class="ie8FontColor">壊して
        </p>
        <p class="ie8FontColor">追いかけて
        </p>
        <p class="ie8FontColor">切り開いたあの空で
        </p>
        <p class="ie8FontColor">Seeking my way
        </p>
        <p class="ie8FontColor">一筋の光になる
        </p>
        <p class="ie8FontColor">with you
        </p>
        <p class="ie8FontColor">男rap：奈落の底
        </p>
        <p class="ie8FontColor">なぁ出口はドコ?
        </p>
        <p class="ie8FontColor">君が照らし出す方向
        </p>
        <p class="ie8FontColor">以外には興味はNo
        </p>
        <p class="ie8FontColor">煌々と輝く金剛の如く
        </p>
        <p class="ie8FontColor">壁を砕けば君に届く?
        </p>
        <p class="ie8FontColor">確かなものなら
        </p>
        <p class="ie8FontColor">きっと無いから、
        </p>
        <p class="ie8FontColor">せめてそう信じてGo on
        </p>
        <p class="ie8FontColor">男：何かを捨てれば
        </p>
        <p class="ie8FontColor">運命は赦されるの?
        </p>
        <p class="ie8FontColor">大切なものほど
        </p>
        <p class="ie8FontColor">腕をすり抜けて行く
        </p>
        <p class="ie8FontColor">鏡に映った
        </p>
        <p class="ie8FontColor">真実と虚像の壁
        </p>
        <p class="ie8FontColor">逃げてるだけじゃ
        </p>
        <p class="ie8FontColor">そう 超えられない
        </p>
        <p class="ie8FontColor">女：一度は諦めかけてた未来
        </p>
        <p class="ie8FontColor">二人で変えてみせる
        </p>
        <p class="ie8FontColor">必ず きっと
        </p>
        <p class="ie8FontColor">果てなく
        </p>
        <p class="ie8FontColor">どこまでも
        </p>
        <p class="ie8FontColor">出口のない迷宮で
        </p>
        <p class="ie8FontColor">Seeking my way
        </p>
        <p class="ie8FontColor">今やっとたどり着いた
        </p>
        <p class="ie8FontColor">with you
        </p>
        <p class="ie8FontColor">男rap：Oh yes,
        </p>
        <p class="ie8FontColor">i just wanna see our future baby
        </p>
        <p class="ie8FontColor">今君を乗せて
        </p>
        <p class="ie8FontColor">峠を越えてく
        </p>
        <p class="ie8FontColor">魂のかけらを持って
        </p>
        <p class="ie8FontColor">震えるその手を取って
        </p>
        <p class="ie8FontColor">怖くはないさ君と僕とで
        </p>
        <p class="ie8FontColor">進もうぜ光指す方へ
        </p>
        <p class="ie8FontColor">女：例えまたいつか
        </p>
        <p class="ie8FontColor">遠く離れても
        </p>
        <p class="ie8FontColor">君だけを見つけ出せるから
        </p>
        <p class="ie8FontColor">壊して
        </p>
        <p class="ie8FontColor">追いかけて
        </p>
        <p class="ie8FontColor">切り開いたあの空で
        </p>
        <p class="ie8FontColor">Seeking my way
        </p>
        <p class="ie8FontColor">一筋の光になる
        </p>
        <p class="ie8FontColor">果てなく
        </p>
        <p class="ie8FontColor">どこまでも
        </p>
        <p class="ie8FontColor">出口のない迷宮で
        </p>
        <p class="ie8FontColor">Seeking my way
        </p>
        <p class="ie8FontColor">今やっとたどり着いた
        </p>
        <p class="ie8FontColor">with you
        </p>
      </div>
    </div>
    </el-scrollbar>
  </el-dialog>
</template>

<style scoped>

</style>