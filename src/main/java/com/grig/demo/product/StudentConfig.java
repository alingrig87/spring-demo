package com.grig.demo.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product iphone13 = new Product(
                    "Iphone 13",
                    2229.99,
                    "Iphone 13 Description",
                    "https://m-cdn.phonearena.com/images/articles/378672-940/iphone-13-packing-stickers-leaked-iphone-12s.jpg");
            Product iphone12 = new Product(
                    "Iphone 12",
                    2229.99,
                    "Iphone 12 Description",
                    "https://lcdn.altex.ro/resize/media/catalog/product/A/p/2bd48d28d1c32adea0e55139a4e6434a/Apple-iPhone-12-5G-Blue_2.jpg");

            productRepository.saveAll(List.of(iphone12, iphone13));
        };
    }
}
