package br.com.rqueiroz.product.model;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

   ProductEntity toProductEntity(Product product);
   Product toProduct(ProductEntity productEntity);
}
