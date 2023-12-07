package com.digital.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CategoriesPojo {
    private String categoriesName;
    private String parentCategories;
    private String price;
}
