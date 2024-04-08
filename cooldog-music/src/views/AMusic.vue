<script setup lang="ts">
import MusicDialog from "@/views/musicDialog.vue";
import {ref} from "vue";

const props = defineProps({
  tableData: {
    type: Array,
    default: () => []
  }
})
const myTitle = ref('')
const visible = ref(false)
const handleClick = (row) => {
  myTitle.value = row.name
  visible.value = true
}
</script>

<template>
  <el-table :data="tableData">
    <el-table-column type="selection" width="50px"/>
    <el-table-column
        prop="name"
        label="歌曲名"
        width="300px">
      <template #default="scope">
        <el-button link type="primary" size="small" @click="handleClick(scope.row)"
        >{{ scope.row.name }}
        </el-button
        >
      </template>
    </el-table-column>
    <el-table-column
        prop="zj"
        label="专辑"
        width="550px">
    </el-table-column>
    <el-table-column
        prop="time"
        label="时长"
        width="100px">
    </el-table-column>
  </el-table>
  <music-dialog :title="myTitle" :my-visible="visible" @close="()=>{
      myTitle = ''
      visible = false
  }"></music-dialog>
</template>

<style scoped>

</style>