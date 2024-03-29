package com.ruoyi.project.medicines.service;

import com.ruoyi.project.medicines.domain.Medicines;

import java.util.List;

public interface MedicinesService {
    int addMedicines(Medicines medicines);
    List<Medicines> getMedicines(Medicines medicines);

}
