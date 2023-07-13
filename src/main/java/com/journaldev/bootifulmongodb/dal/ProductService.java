package com.journaldev.bootifulmongodb.dal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journaldev.bootifulmongodb.model.Product;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(Integer id) {
        return repo.findOne(id);
    }
     
    public void delete(Integer id) {
        repo.delete(id);
    }
	
}
