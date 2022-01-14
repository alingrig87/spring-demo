package com.grig.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// the same as @Component but used for readability
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        Optional<Product> productOptional = productRepository
                .findProductByName(product.getName());
        if(productOptional.isPresent()) {
            throw new IllegalStateException("name is taken");
        }
        productRepository.save(product);
    }
}
