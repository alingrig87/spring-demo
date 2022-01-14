package com.grig.demo;

import com.grig.demo.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Product> hello() {
		return List.of(
				new Product(1L, "iphone X", 999.99, "Iphone X",
						"https://shop.flip.ro/serve-device-photos?n=apple_iphone-x_silver_sell.jpg&s=1000&t=device-images"),
				new Product(2L, "iphone XS", 1099.99, "Iphone XS",
						"https://shop.flip.ro/serve-device-photos?n=apple_iphone-xs_space-grey_sell.jpg&s=1000&t=device-images")
		);
	}

}
