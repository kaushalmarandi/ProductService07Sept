package m.kash.productservicek.Dtos;

import lombok.Getter;
import lombok.Setter;
import m.kash.productservicek.Models.Category;
import m.kash.productservicek.Models.Product;

import java.util.List;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;


    public Product toProduct(){
        Product product =new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImage(image);

        Category category1= new Category();
        category1.setTitle(category);

        product.setCategory(category1);
        return product;
    }

}
