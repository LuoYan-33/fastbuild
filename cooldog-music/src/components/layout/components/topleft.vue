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
    <el-input v-model="searchText" :prefix-icon="Search" class="search" @keydown.enter="onSearch"></el-input>
  </div>
</template>

<style scoped>

</style>