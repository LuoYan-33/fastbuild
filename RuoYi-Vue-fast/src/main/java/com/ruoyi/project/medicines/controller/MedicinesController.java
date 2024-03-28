package com.ruoyi.project.medicines.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicines")
public class MedicinesController {
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
}
