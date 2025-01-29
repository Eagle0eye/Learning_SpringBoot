package com.project.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductForm {
    private long id;
    private String title;
    private String category;
    private float price;
}
