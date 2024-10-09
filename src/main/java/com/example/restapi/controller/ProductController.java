package com.example.restapi.controller;


import com.example.restapi.dto.ProductDTO;
import com.example.restapi.entity.Product;
import com.example.restapi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/new")
   public ResponseEntity<Product> createProduct(@RequestBody ProductDTO ProductDTO){
  return new ResponseEntity<>(productService.create(ProductDTO), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.readAllProduct(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(productService.updateProduct(id, productDTO), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public HttpStatus deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return HttpStatus.OK;
    }


}
