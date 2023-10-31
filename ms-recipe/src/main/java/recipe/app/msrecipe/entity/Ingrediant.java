package recipe.app.msrecipe.entity;

import jakarta.persistence.*;

@Entity
public class Ingrediant
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingrediantId;
    private String nom ;
    private String poid;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;


}
