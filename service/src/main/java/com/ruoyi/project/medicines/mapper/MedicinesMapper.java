package com.ruoyi.project.medicines.mapper;

import com.ruoyi.project.medicines.domain.Medicines;
import org.apache.ibatis.annotations.Mapper;

/**
 * 药品
 */
@Mapper
public interface MedicinesMapper {
    int addMedicines(Medicines medicines);
}
