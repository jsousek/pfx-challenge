package com.pfx.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor

public class Product {
    String productName;
    String productGroup;
    BigDecimal productCost;
}
