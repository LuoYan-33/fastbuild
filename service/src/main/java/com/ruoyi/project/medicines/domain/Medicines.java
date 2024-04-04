package com.ruoyi.project.medicines.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 药品表实体类
 */
@Data
public class Medicines extends BaseEntity {
  private String id;
  @Excel(name = "药品名称")
  @NotBlank(message = "药品名称不能为空")
  private String name;
  @NotBlank(message = "生产厂家不能为空")
  @Excel(name = "生产厂家")
  private String manufacturers;
  @NotBlank(message = "单位不能为空")
  @Excel(name = "单位")
  private char unit;
  @NotNull(message = "单价不能为空")
  @Excel(name = "单价")
  private double price;
  @Excel(name = "库存")
  @NotNull(message = "库存不能为空")
  private double stock;
  @NotNull(message = "库存预警不能为空")
  @Excel(name = "库存预警")
  private double warning;
}
