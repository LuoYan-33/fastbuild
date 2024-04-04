package com.ruoyi.project.medicines.service.impl;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.mapper.MedicinesMapper;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 药品管理服务实现类
 */
@Service
public class MedicinesServiceImpl implements MedicinesService {
    @Autowired
    private MedicinesMapper medicinesMapper;

    /**
     * 添加药品信息
     *
     * @param medicines 药品实体对象
     * @return 返回添加结果，1表示成功，其他表示失败
     */
    @Override
    @Transactional
    public AjaxResult addMedicines(Medicines medicines) {
        int i1 = medicinesMapper.addMedicines(medicines);
        if (i1 > 0) {
            return AjaxResult.success("添加成功");
        } else {
            return AjaxResult.error("添加失败");
        }
    }

    /**
     * 根据条件查询药品信息
     * @param medicines 包含查询条件的药品实体对象
     * @return 返回药品列表
     */
    @Override
    public List<Medicines> getMedicines(Medicines medicines) {
        return medicinesMapper.getMedicines(medicines);
    }

    /**
     * 更新药品信息
     * @param medicines 需要更新的药品实体对象
     * @return 返回更新结果，1表示成功，其他表示失败
     */
    @Override
    public AjaxResult updateMedicines(Medicines medicines) {
        return null;
    }

    /**
     * 根据ID列表删除药品信息
     * @param ids 需要删除的药品ID列表
     * @return 返回删除结果，1表示成功，其他表示失败
     */
    @Override
    public AjaxResult deleteMedicines(List<String> ids) {
        if (ids != null && ids.size() > 0) {
            int i = medicinesMapper.deleteMedicines(ids);
            if (i > 0) {
                return AjaxResult.success("删除成功");
            }
            return AjaxResult.error("删除失败");
        }
        return AjaxResult.warn("未找到对应数据");
    }
}
