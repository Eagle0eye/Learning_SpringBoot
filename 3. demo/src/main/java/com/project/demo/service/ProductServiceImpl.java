package com.project.demo.service;

import com.project.demo.dto.UpdateForm;
import com.project.demo.model.Product;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Copies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private List<Product> products ;
    ProductServiceImpl(){
        products = new ArrayList<>(Arrays.asList(
                new Product(2L, "Tomato", "Food", 12.3f),
                new Product(3L, "Camera", "Digital Devices", 122.22f)
        ));

    }



    @Override
    public List<Product> getAllProducts() {
        return products;
    }


    @Override
    public void addProduct(Product product) {
        System.out.println(product);
        products.add(product);
    }

    @Override
    public Product getProduct(long prodId) {
        return products.stream().filter(product -> product.getId() ==prodId).findFirst().orElse(new Product(0,"not Title","No Category",0));
    }

    @Override
    public void updateById(long id, UpdateForm form){
    int index_current =0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index_current =i;
                break;
            }
        }
        products.set(index_current,assignForm2Product(id, form));

    }

    @Override
    public void deleteById(long id) {
        Product found_product = products.stream().filter(product -> product.getId()==id).findFirst().get();
        products.remove(found_product);
    }


    private Product assignForm2Product(long id,UpdateForm form){
        return new Product(id,form.getTitle(), form.getCategory(), form.getPrice());
    }


}
