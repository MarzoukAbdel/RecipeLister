package recipe.app.msrecipe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RecipeDto {

    String title;
    String description ;
    String category ;
    String area;
    String image;



}
