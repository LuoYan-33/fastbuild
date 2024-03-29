package com.ruoyi.project.medicines.service.impl;

import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.mapper.MedicinesMapper;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicinesServiceImpl implements MedicinesService {
    @Autowired
    private MedicinesMapper medicinesMapper;
    @Override
    public int addMedicines(Medicines medicines) {
       return medicinesMapper.addMedicines(medicines);
    }
}
