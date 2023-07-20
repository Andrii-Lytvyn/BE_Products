package de.ait.minishop.services;

import de.ait.minishop.models.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductsService {
    public List<Products> getAllProducts() {
        Products product1 = new Products(1L, "Rice", false, 12);
        Products product2 = new Products(2L, "Milk", true, 6);
        Products product3 = new Products(3L, "Sugar", false, 63);
        Products product4 = new Products(4L, "Tomato", true, 1);
        Products product5 = new Products(5L, "Cucumber", false, 7);
        Products product6 = new Products(6L, "Ice-Cream", false, 12);
        return Arrays.asList(product1, product2, product3, product4, product5, product6);
    }
}