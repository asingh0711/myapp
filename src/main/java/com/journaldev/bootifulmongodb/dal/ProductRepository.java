package com.journaldev.bootifulmongodb.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.journaldev.bootifulmongodb.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
