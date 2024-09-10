package m.kash.productservicek.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestBodyProductDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

}
