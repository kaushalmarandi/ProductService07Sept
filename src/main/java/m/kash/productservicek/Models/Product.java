package m.kash.productservicek.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseModel{
   // private Long id;
    //private String name;
    private String title;
    private Double price;
    private String description;
    private String image;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;


}
