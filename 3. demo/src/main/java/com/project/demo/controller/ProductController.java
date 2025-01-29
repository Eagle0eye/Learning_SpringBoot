package com.project.demo.controller;


import com.project.demo.dto.UpdateForm;
import com.project.demo.model.Product;
import com.project.demo.dto.ProductForm;
import com.project.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ProductController {

//    @Autowired
    private  ProductService productService;
    ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<String> addProduct(@RequestBody ProductForm product)
    {
        Product addedItem = new Product(
                product.getId(),
                product.getTitle(),
                product.getCategory(),
                product.getPrice()
        );


        productService.addProduct(addedItem);
        return new ResponseEntity<>("Product has been created!",HttpStatus.CREATED);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product>getProduct(@PathVariable(name = "id") Long id) {

        try {
            Product product= productService.getProduct(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }


    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>>getProduct() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable(name = "id") long id, @RequestBody UpdateForm form){
        productService.updateById(id,form);
        return new ResponseEntity<>("The Product has been updated",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable(name = "id") long id){
        productService.deleteById(id);
        return new ResponseEntity<>("The product has been deleted",HttpStatus.OK);
    }
}
