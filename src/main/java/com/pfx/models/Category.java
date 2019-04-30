package com.pfx.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.Range;

@Getter
@Setter
@AllArgsConstructor

public class Category {
    String catName;
    Range<Double> categoryRange;
}
