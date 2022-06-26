package com.petrov.webflowapp.persist;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
@Component
public class ProductRepositoryImpl implements ProductRepository {

    private Map<Long, Product> productMap = new ConcurrentHashMap<>();

    private AtomicLong identity = new AtomicLong(0);

    public List<Product> findAll() {
        this.insert(new Product(1L,"4553", "Apple", "erferf", new Category(), BigDecimal.valueOf(70)));
        this.insert(new Product(2L,"Banana", "4544585", "jbntfg", new Category(), BigDecimal.valueOf(50)));
        this.insert(new Product(3L,"Fish", "65445454", "fdjdfjjh", new Category(), BigDecimal.valueOf(100)));
        return new ArrayList<>(productMap.values());
    }

    public Product findById(long id) {
        return productMap.get(id);
    }

    public void insert(Product product) {
        long id = identity.incrementAndGet();
        product.setId(id);
        productMap.put(id, product);
    }

    public void update(Product product) {
        productMap.put(product.getId(), product);
    }

    public void delete(long id) {
        productMap.remove(id);
    }

}
