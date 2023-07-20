package de.ait.minishop.services.impl;

import de.ait.minishop.models.Products;
import de.ait.minishop.repositories.ProductsRepository;
import de.ait.minishop.services.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
}