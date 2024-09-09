package m.kash.productservicek.Controllers;

import m.kash.productservicek.Models.Product;
import m.kash.productservicek.Services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    ProductService productService;
    public ProductController(@Qualifier("fakestore") ProductService productService){
        this.productService=productService;
    }

    @PostMapping("/products")
    public void createProduct(){
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @PutMapping("/products")
    public void updateProduct(){

    }
}
