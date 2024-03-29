<template>
  <el-card title="药品管理">
    <el-form :model="state">
      <el-row>
        <el-col :span="6">
          <el-form-item label="药品名称">
            <el-input :allow-clear="true" v-model="state.name"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="18">
          <div class="head-card-btn-group">
            <el-button class="mr-10" type="primary" @click="onSearch">查询</el-button>
            <el-button class="mr-10" @click="reset">重置</el-button>
          </div>
        </el-col>
      </el-row>
    </el-form>
  </el-card>
  <el-card style="margin-top: 10px">
    <template #header>
      <div class="head-card-btn-group">
        <el-button class="mr-10" type="primary" @click="onCreate">创建</el-button>
        <el-button @click="onExport">导出</el-button>
      </div>
    </template>
    <el-table :data="data">
      <el-table-column prop="name" label="药品名称" width="180" />
      <el-table-column prop="manufacturers" label="生产商" width="180" />
      <el-table-column prop="specification" label="规格" />
      <el-table-column prop="stock" label="库存" />
      <el-table-column prop="warning" label="库存预警" />
      <el-table-column fixed="right" label="操作" width="120">
        <template #default>
          <el-button link type="primary" size="small">修改</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
        v-model:current-page="state.pageNum"
        v-model:page-size="state.pageSize"
        :page-sizes="[100, 200, 300, 400]"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total"
        @size-change="onSearch"
        @current-change="handleCurrentChange"
    />
  </el-card>
  <EditModel ref="editModal"></EditModel>
</template>
<script setup lang="ts">
import {reactive, ref} from "vue";
import EditModel from "@/views/medicationManagement/EditModal.vue";
import {getMedicines} from '@/api/medicines/medicines'
const editModal = ref();
const state = reactive({
  name: '',
  pageNum: 1,
  pageSize: 5
})
const total=ref(0)
const onSearch = () => {
  getMedicines(state).then(res=>{
    data.value = res.rows
    total.value = res.total
  })
}
const data = ref([])
const handleCurrentChange = (val)=>{
  state.pageNum=val
  onSearch()
}
const reset = () => {
  state.name = ''
}
const onExport = () => {

}
const onCreate = () => {
  editModal.value.openCreate()
}

</script>

<style scoped>

</style>