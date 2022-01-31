package com.allirathan.product.repository;
import com.allirathan.product.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> 
{
    
}