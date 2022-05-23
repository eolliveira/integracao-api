package com.example.consumerapi.services;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private WebClient webClient;

    public Product findById(Long id){

        Mono<Product> monoProduct = this.webClient
                .method(HttpMethod.GET)
                .uri("http://localhost:8081/product/{id}", id)
                .retrieve()
                .bodyToMono(Product.class);

        Product p = monoProduct.block();

        return p;
    }

}
