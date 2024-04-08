<script setup lang="ts">

import {Search} from "@element-plus/icons-vue";
import {ref} from "vue";
const searchText=ref('')
const emit=defineEmits(['Search'])
const onSearch = () => {
  emit("Search",searchText.value)
}
</script>

<template>
  <div>
    <img style="width: 146px;height: 38px;margin-right: 40px;" src="@/components/icons/kugou_white.png">
    <el-input v-model="searchText" :prefix-icon="Search" class="search" @keydown.enter="onSearch"></el-input>
  </div>
</template>

<style scoped>

</style>