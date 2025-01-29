package com.project.demo.service;

import com.project.demo.dto.UpdateForm;
import com.project.demo.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();

    public Product getProduct(long id);
    public void addProduct(Product product);
    public void updateById(long id, UpdateForm form);

    public void deleteById(long id);
}
