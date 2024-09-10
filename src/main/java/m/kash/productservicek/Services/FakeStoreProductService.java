package m.kash.productservicek.Services;

import m.kash.productservicek.Dtos.FakeStoreProductDto;
import m.kash.productservicek.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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
        List<Product> products=new ArrayList<>();
        FakeStoreProductDto[] fakeStoreProductDtos=restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos){
            products.add(fakeStoreProductDto.toProduct());
        }
        return products;
    }

    @Override
    public Product createProduct(String title, double price, String description, String image, String category) {
       FakeStoreProductDto fakeStoreProductDto=new FakeStoreProductDto();
       fakeStoreProductDto.setTitle(title);
       fakeStoreProductDto.setPrice(price);
       fakeStoreProductDto.setDescription(description);
       fakeStoreProductDto.setImage(image);
       fakeStoreProductDto.setCategory(category);

       FakeStoreProductDto fakeStoreProductDto1=  restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreProductDto, FakeStoreProductDto.class);
        return fakeStoreProductDto1.toProduct();
    }
}
