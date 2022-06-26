package com.petrov.webflowapp.persist;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    void insert(Product product);

    Product findById(long id);

    void update(Product product);

    void delete(long id);
}
