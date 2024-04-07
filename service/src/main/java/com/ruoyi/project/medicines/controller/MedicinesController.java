package com.ruoyi.project.medicines.controller;

import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 药品管理控制器
 */
@RestController
@RequestMapping("/medicines")
public class MedicinesController extends BaseController {
    /**
     * 注入药品服务层
     */
    @Autowired
    private MedicinesService medicinesService;

    /**
     * 添加药品
     *
     * @param medicines 药品信息
     * @return 添加结果
     */
    @Log(title = "药品管理", businessType = BusinessType.INSERT)
    @PostMapping("/addMedicines")
    public AjaxResult addMedicines(@RequestBody Medicines medicines) {
        return medicinesService.addMedicines(medicines);
    }
    /**
     * 查询药品信息
     *
     * @param medicines 查询条件
     * @return 查询结果
     */
    @GetMapping("/getMedicines")
    public TableDataInfo getMedicines(Medicines medicines) {
      startPage();
        List<Medicines> i = medicinesService.getMedicines(medicines);
//        clearPage();
        return getDataTable(i);

    }

    /**
     * 更新药品信息
     *
     * @param medicines 药品信息
     * @return 更新结果
     */
    @Log(title = "药品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/updateMedicines")
    public AjaxResult updateMedicines(@RequestBody Medicines medicines) {
        return medicinesService.updateMedicines(medicines);
    }

    /**
     * 删除药品信息
     *
     * @param ids 药品ID列表
     * @return 删除结果
     */
    @Log(title = "药品管理", businessType = BusinessType.DELETE)
    @PostMapping("/deleteMedicines")
    public void deleteMedicines(@RequestBody List<String> ids) {
         medicinesService.deleteMedicines(ids);
    }
}

