package com.example.ex_6.controllers;

import com.example.ex_6.models.Product;
import com.example.ex_6.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsController {

    private final ProductsService productsService;

    @Autowired
    public ProductsController(
            ProductsService productsService
    ) {
        this.productsService = productsService;
    }

    @GetMapping(path = "/products")
    public String viewProducts(
            Model model
    ) {
        var products = productsService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProducts(
            Model model,
            Product product
    ) {
        productsService.addProduct(product);

        var products = productsService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

}
