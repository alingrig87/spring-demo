package com.grig.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Product and his primarty key the Id which is Long
@Repository
interface ProductRepository extends JpaRepository<Product, Long> {

}
