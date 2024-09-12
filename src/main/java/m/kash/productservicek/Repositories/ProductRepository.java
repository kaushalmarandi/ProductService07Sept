package m.kash.productservicek.Repositories;

import m.kash.productservicek.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);
}
