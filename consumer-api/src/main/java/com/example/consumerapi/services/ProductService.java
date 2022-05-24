package com.example.consumerapi.services;

import com.example.consumerapi.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private WebClient webClientProducts;

    @Autowired
    private WebClient webClientPrices;

    public Product findById(Long id){

        /*
        Mono<Product> monoProduct = this.webClientProducts
                .method(HttpMethod.GET)
                .uri("/products/{id}", id)
                //envia request
                .retrieve()
                .bodyToMono(Product.class);

        Mono<Product> monoPrice = this.webClientPrices
                .method(HttpMethod.GET)
                .uri("/prices/{id}", id)
                //envia request
                .retrieve()
                .bodyToMono(Product.class);

        //agrupa uma lista de mono, e aguarda todas as req finalizarem
        Product product = Mono.zip(monoProduct, monoPrice).map(tuple -> {
            tuple.getT1().setPrice(tuple.getT2().getPrice());
            return tuple.getT1();
        }).block();
         */

        Product product = new Product(10L, "Celular", 45.0);

        Mono<Product> productMono = webClientProducts
                .method(HttpMethod.POST)
                .uri("/products")
                .body(BodyInserters.fromValue(product))
                .retrieve()
                //define o tipo do retorno
                .bodyToMono(Product.class);

        return product;
    }
}
