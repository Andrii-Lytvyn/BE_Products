package de.ait.minishop.controllers;

import de.ait.minishop.models.Products;
import de.ait.minishop.services.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductsController {
    private final ProductsService productsService;
    public ProductsController(ProductsService service){
        this.productsService=service;
    }
    @GetMapping("/products")
    @ResponseBody
    public List<Products> getProducts() {
        return productsService.getAllProducts();

    }
}
