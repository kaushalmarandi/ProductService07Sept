package m.kash.productservicek.Controllers;

import m.kash.productservicek.Dtos.RequestBodyProductDto;
import m.kash.productservicek.Models.Product;
import m.kash.productservicek.Services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    ProductService productService;
    public ProductController(@Qualifier("selfproductservice") ProductService productService){
        this.productService=productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody RequestBodyProductDto request){
        return productService.createProduct(request.getTitle(),
                request.getPrice(),
                request.getDescription(),
                request.getImage(),
                request.getCategory());
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products=productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);

    }

    @PutMapping("/products")
    public void updateProduct(){

    }

}
