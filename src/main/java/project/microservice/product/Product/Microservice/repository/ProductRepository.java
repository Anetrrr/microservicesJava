package project.microservice.product.Product.Microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import project.microservice.product.Product.Microservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
