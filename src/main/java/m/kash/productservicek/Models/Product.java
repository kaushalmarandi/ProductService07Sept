package m.kash.productservicek.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    //private String name;
    private String title;
    private Double price;
    private String description;
    private String image;
    private Category category;


}
