package m.kash.productservicek.Services;

import m.kash.productservicek.Models.Category;
import m.kash.productservicek.Models.Product;
import m.kash.productservicek.Repositories.CategoryRepository;
import m.kash.productservicek.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfproductservice")
public class SelfProductService implements ProductService{

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title, double price, String description, String image, String category) {
       Product p =new Product();
       p.setTitle(title);
       p.setPrice(price);
       p.setDescription(description);
       p.setImage(image);
      // p.setCategory(category);

        Category categoryFromDatabase = categoryRepository.findByTitle(category);
        if(categoryFromDatabase == null){
            Category category1= new Category();
            category1.setTitle(category);
            categoryFromDatabase=category1;
        }

        p.setCategory(categoryFromDatabase);

        Product savedProduct=productRepository.save(p);
        return savedProduct;
    }
}
