package com.example.restapi.service;

import com.example.restapi.dto.ProductDTO;
import com.example.restapi.entity.Product;
import com.example.restapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product create (ProductDTO ProductDTO){
        Product product = Product.builder()
                .name(ProductDTO.getName())
                .amount(ProductDTO.getAmount())
                .build();
        return productRepository.save(product);
    }


    public List<Product> readAllProduct(){
        return productRepository.findAll();
    }


    public Product updateProduct(int id, ProductDTO productDTO)
    {
        Product product = productRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
        product.setName(productDTO.getName());
        product.setAmount(productDTO.getAmount());

        return productRepository.save(product);
    }


    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }

}
