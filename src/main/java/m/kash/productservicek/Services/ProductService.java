package m.kash.productservicek.Services;

import m.kash.productservicek.Models.Category;
import m.kash.productservicek.Models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();

    Product createProduct(String title,
                          double price,
                          String description,
                          String image,
                          String category);
    }

