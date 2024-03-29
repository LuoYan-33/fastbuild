import request from '@/utils/request'

export function addMedicines(data) {
    return request({
        url: '/medicines/addMedicines',
        method: 'post',
        data: data
    })
}