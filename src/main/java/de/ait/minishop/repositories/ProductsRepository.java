package de.ait.minishop.repositories;

import de.ait.minishop.models.Products;

import java.util.List;

public interface ProductsRepository {
    List<Products> findAll();
}
