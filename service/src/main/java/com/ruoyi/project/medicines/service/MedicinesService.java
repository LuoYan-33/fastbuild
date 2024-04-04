package com.ruoyi.project.medicines.service;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.medicines.domain.Medicines;

import java.util.List;

public interface MedicinesService {
    AjaxResult addMedicines(Medicines medicines);
    List<Medicines> getMedicines(Medicines medicines);
    AjaxResult updateMedicines(Medicines medicines);
    AjaxResult deleteMedicines(List<String> ids);
}
