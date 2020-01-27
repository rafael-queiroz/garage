package br.com.rqueiroz.product.controller;


import br.com.rqueiroz.product.model.Product;
import br.com.rqueiroz.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("enabled/all")
    public ResponseEntity<List<Product>> message() {
        return ResponseEntity.ok(service.getList());
    }
}
