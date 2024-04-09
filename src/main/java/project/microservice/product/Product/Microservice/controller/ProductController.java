package project.microservice.product.Product.Microservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import project.microservice.product.Product.Microservice.dto.ProductRequest;
import project.microservice.product.Product.Microservice.dto.ProductResponse;
import project.microservice.product.Product.Microservice.model.Product;
import project.microservice.product.Product.Microservice.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct (@RequestBody ProductRequest productRequest){

        productService.createProduct(productRequest);
        return "Product successfully created";
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
       return productService.getAllProducts();
    }





}
