package m.kash.productservicek.Repositories;

import m.kash.productservicek.Models.Category;
import m.kash.productservicek.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);

    Product findByIdIs(long id);
    @Override
    List<Product> findAll();

    List<Product> findAllByCategory(Category category);

    @Query("select p from Product p where p.title = :title" )
    List<Product> findAllProductsByAParticularName(@Param("title") String title);
}
