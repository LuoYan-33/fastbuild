package com.ruoyi.project.medicines.mapper;

import com.ruoyi.project.medicines.domain.Medicines;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 药品
 */
@Mapper
public interface MedicinesMapper {
    int addMedicines(Medicines medicines);
    List<Medicines> getMedicines(Medicines medicines);
    int updateMedicines(Medicines medicines);
    int deleteMedicines(List<String> ids);
    int checkSame(Medicines medicines);
}
