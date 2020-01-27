package br.com.rqueiroz.product.service;

import br.com.rqueiroz.product.model.Product;
import br.com.rqueiroz.product.model.ProductEntity;
import br.com.rqueiroz.product.model.ProductMapper;
import br.com.rqueiroz.product.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
@Validated
public class ProductService {

    @Autowired
    ProductMapper mapper;

    @Autowired
    ProductRepository productRepository;

    @Transactional
    @Validated
    public Long create(@Valid Product product) {
        ProductEntity productEntity = mapper.toProductEntity(product);
        productRepository.save(productEntity);

        return productEntity.getId();
    }

    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(p -> products.add(mapper.toProduct(p)));
        return products;
    }
}
