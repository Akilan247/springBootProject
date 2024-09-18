package com.example.ecomm_website.Service;

import com.example.ecomm_website.Repository.ProductRepo;
import com.example.ecomm_website.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }
}
