package com.ruoyi.project.medicines.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicinesController extends BaseController {
    @Autowired
    private MedicinesService medicinesService;
    @PostMapping("/addMedicines")
    public AjaxResult addMedicines(@RequestBody Medicines medicines) {
        int i = medicinesService.addMedicines(medicines);
        if (i <= 0) {
            return AjaxResult.error("添加失败");
        }
        return AjaxResult.success("添加成功");
    }
    @PostMapping ("/getMedicines")
    public TableDataInfo updateMedicines(@RequestBody Medicines medicines) {
        startPage(medicines);
        List<Medicines> i = medicinesService.getMedicines(medicines);
        return getDataTable(i);
    }
}
