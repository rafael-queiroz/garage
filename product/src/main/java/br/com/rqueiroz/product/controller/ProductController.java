package br.com.rqueiroz.product.controller;

import br.com.rqueiroz.product.model.Product;
import br.com.rqueiroz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity create(@RequestBody Product product, UriComponentsBuilder uriComponentsBuilder) {
        Long id = productService.create(product);

        final URI uri = uriComponentsBuilder.path("/{id}")
                .build(id);

        return ResponseEntity.created(uri)
                .build();
    }

    @GetMapping(    produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<Product> findaAll() {
        return productService.findAll();
    }
}
