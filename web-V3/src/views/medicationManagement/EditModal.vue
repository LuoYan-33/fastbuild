<template>
  <el-dialog :title="title" v-model="visible" :width="500" :before-close="onCancel">
    <el-form label-position="right" label-width="auto" ref="myForm" :model="state" :rules="rules">
      <el-form-item label="药品名称" prop="name">
        <el-input v-model="state.name"></el-input>
      </el-form-item>
      <el-form-item label="生产商" prop="manufacturers">
        <el-input v-model="state.manufacturers"></el-input>
      </el-form-item>
      <el-form-item label="规格" prop="specification" >
        <el-input-number v-model="state.specification"></el-input-number>(g)
      </el-form-item>
      <el-form-item label="单价" prop="specification">
        <el-input-number v-model="state.price"></el-input-number>
      </el-form-item>
      <el-form-item label="库存" prop="stock">
        <el-input-number v-model="state.stock"></el-input-number>
      </el-form-item>
      <el-form-item label="库存预警" prop="warning">
        <el-input-number v-model="state.warning"></el-input-number>
      </el-form-item>
    </el-form>
    <template #footer>
      <div class="dialog-footer">
        <el-button @click="onCancel">取消</el-button>
        <el-button type="primary" @click="onSubmit">确定</el-button>
      </div>
    </template>
  </el-dialog>
</template>
<script setup lang="ts">
import {reactive, ref} from "vue";
import {addMedicines} from '@/api/medicines/medicines'
import {ElMessage} from "element-plus";
const myForm = ref();
const title = ref();
const visible = ref(false);
const state = reactive({
  name: '',
  manufacturers: '',
  specification: '',
  price: 0,
  stock: 0,
  warning: 0,
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
    addMedicines(state).then(() => {
      ElMessage.success('添加成功')
      emits('submit')
      onCancel()
    }).catch((err) => {
    })
  })
}
const emits=defineEmits(['submit'])
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