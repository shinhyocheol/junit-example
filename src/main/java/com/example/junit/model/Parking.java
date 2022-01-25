package com.example.junit.model;

import lombok.Getter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
public class Parking {

    public interface Apt {}

    @NotNull(message = "건물유형을 입력해주세요.")
    private Integer buildingType;

    @NotNull(message = "주차 가능 여부를 선택해주세요.")
    private Boolean parkingAvailable;

    @NotNull(message = "주차 가능 여부를 선택해주세요.")
    private Integer total;

    @NotNull(message = "주차 가능 여부를 선택해주세요.", groups = Apt.class)
    private Integer average;

    @DecimalMin(value = "0", message = "주차비를 최소 {value}만원 이상으로 입력해주세요. (${validatedValue})")
    @DecimalMax(value = "99", message = "주차비를 최대 {value}만원 이하로 입력해주세요. (${validatedValue})")
    private Integer cost;

}
