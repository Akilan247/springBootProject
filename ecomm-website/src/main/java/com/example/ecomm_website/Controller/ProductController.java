package com.example.ecomm_website.Controller;

import com.example.ecomm_website.Service.ProductService;
import com.example.ecomm_website.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "welcome to website";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
