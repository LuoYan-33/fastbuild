package com.ruoyi.project.medicines.service.impl;

import com.github.pagehelper.PageHelper;
import com.ruoyi.framework.web.page.PageDomain;
import com.ruoyi.framework.web.page.TableSupport;
import com.ruoyi.project.medicines.domain.Medicines;
import com.ruoyi.project.medicines.mapper.MedicinesMapper;
import com.ruoyi.project.medicines.service.MedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinesServiceImpl implements MedicinesService {
    @Autowired
    private MedicinesMapper medicinesMapper;
    @Override
    public int addMedicines(Medicines medicines) {
       return medicinesMapper.addMedicines(medicines);
    }

    @Override
    public List<Medicines> getMedicines(Medicines medicines) {
        return medicinesMapper.getMedicines(medicines);
    }
}
