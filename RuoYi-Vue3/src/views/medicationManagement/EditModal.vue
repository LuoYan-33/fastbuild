<template>
  <el-modal :title="title" :open="visible" :width="500" @ok="onSubmit" @cancel="onCancel">
    <el-form ref="myForm" :model="state" :rules="rules">
      <el-form-item label="药品名称" name="name">
        <el-input v-model:value="state.name"></el-input>
      </el-form-item>
      <el-form-item label="生产商" name="manufacturers">
        <el-input v-model:value="state.manufacturers"></el-input>
      </el-form-item>
      <el-form-item label="规格" name="specification">
        <el-input v-model:value="state.specification"></el-input>
      </el-form-item>
      <el-form-item label="库存" name="stock">
        <el-input v-model:value="state.stock"></el-input>
      </el-form-item>
      <el-form-item label="库存预警" name="warning">
        <el-input v-model:value="state.warning"></el-input>
      </el-form-item>
    </el-form>
  </el-modal>
</template>
<script setup lang="ts">
import {reactive, ref} from "vue";
import {medicinesApi} from "@/api/medicines";
import {message} from "ant-design-vue";

const myForm = ref();
const title = ref();
const visible = ref(false);
const state = reactive({
  name: '',
  manufacturers: '',
  specification: '',
  stock: '',
  warning: ''
})
const rules = ref({
  name: [{required: true, message: '请输入药品名称', trigger: 'blur'}],
  manufacturers: [{required: true, message: '请输入生产商', trigger: 'blur'}],
  specification: [{required: true, message: '请输入规格', trigger: 'blur'}],
  stock: [{required: true, message: '请输入库存', trigger: 'blur'}],
  warning: [{required: true, message: '请输入库存预警', trigger: 'blur'}],
})
const openCreate = () => {
  title.value = '新增药品';
  visible.value = true;
};
const openEdit = (data) => {
  title.value = '编辑药品';
  visible.value = true;
};
const onCancel = () => {
  for (let key in state) {
    state[key] = ''
  }
  visible.value = false;
}
const onSubmit = () => {
  myForm.value.validate().then(() => {
    medicinesApi().add(state).then(() => {
      message.success('添加成功')
      onCancel()
    }).catch((err) => {
      message.error(err)
    })
  })
}
defineExpose({
  openCreate,
  openEdit
})
</script>

<style scoped>
:deep(.ant-form-item-label) {
  width: 100px;
}
</style>