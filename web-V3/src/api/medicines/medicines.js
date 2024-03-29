import request from '@/utils/request'

export function addMedicines(data) {
    return request({
        url: '/medicines/addMedicines',
        method: 'post',
        data: data
    })
}
export function getMedicines(data) {
    return request({
        url: '/medicines/getMedicines',
        method: 'post',
        data: data
    })
}