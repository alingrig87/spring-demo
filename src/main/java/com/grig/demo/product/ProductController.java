package com.grig.demo.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(1L, "iphone X", 999.99, "Iphone X",
                        "https://shop.flip.ro/serve-device-photos?n=apple_iphone-x_silver_sell.jpg&s=1000&t=device-images"),
                new Product(2L, "iphone XS", 1099.99, "Iphone XS",
                        "https://shop.flip.ro/serve-device-photos?n=apple_iphone-xs_space-grey_sell.jpg&s=1000&t=device-images")
        );
    }
}
