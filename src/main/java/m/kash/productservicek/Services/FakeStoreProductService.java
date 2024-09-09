package m.kash.productservicek.Services;

import m.kash.productservicek.Dtos.FakeStoreProductDto;
import m.kash.productservicek.Models.Category;
import m.kash.productservicek.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakestore")
public class FakeStoreProductService implements ProductService{


    private  RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
    this.restTemplate= restTemplate;
}
    @Override
    public Product getSingleProduct(Long productId) {
       FakeStoreProductDto fakeStoreProductDto= restTemplate.getForObject("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        return fakeStoreProductDto.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title, double price, String description, Category category, String image) {
        return null;
    }
}
