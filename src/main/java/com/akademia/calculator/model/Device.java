package com.akademia.calculator.model;

import lombok.*;

import java.math.BigDecimal;

// @NoArgsConstructor
@ToString
// @AllArgsConstructor
public class Device {



    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Long power;
    @Setter
    @Getter
    private BigDecimal priceForHour;
    @Setter
    @Getter
    private BigDecimal priceForOneDay;
}
