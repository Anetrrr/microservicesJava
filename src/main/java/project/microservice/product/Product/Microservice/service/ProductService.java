package project.microservice.product.Product.Microservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.microservice.product.Product.Microservice.dto.ProductResponse;
import project.microservice.product.Product.Microservice.model.Product;
import project.microservice.product.Product.Microservice.repository.ProductRepository;
import project.microservice.product.Product.Microservice.dto.ProductRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    public final ProductRepository productRepository;
    public String createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
        return "product service working!";

    }

    public List<ProductResponse> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
