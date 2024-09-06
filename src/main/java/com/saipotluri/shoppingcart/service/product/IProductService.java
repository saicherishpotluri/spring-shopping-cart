package com.saipotluri.shoppingcart.service.product;
import com.saipotluri.shoppingcart.model.Product;
import com.saipotluri.shoppingcart.request.AddProductRequest;
import com.saipotluri.shoppingcart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductId(Long id);
    Product updateProduct(ProductUpdateRequest request, Long id);
    List<Product> getAllProducts();
    List<Product> getProductByCategory(String category);
    List<Product> getProductByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String brand, String name);
    Long countProductByBrandAndName(String brand, String name);
}
