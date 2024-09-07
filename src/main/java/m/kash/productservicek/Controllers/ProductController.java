package m.kash.productservicek.Controllers;

import m.kash.productservicek.Models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @PostMapping("/products")
    public Product createProduct(){
        return new Product();
    }

    @GetMapping("/products/{id}")
    public void getProductDetails(@PathVariable("id") Long id){

    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @PutMapping("/products")
    public void updateProduct(){

    }
}
