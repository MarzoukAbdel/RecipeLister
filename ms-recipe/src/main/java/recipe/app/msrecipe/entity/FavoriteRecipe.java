package recipe.app.msrecipe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favorite_recipes")
public class FavoriteRecipe {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    // Getters and setters, constructors, and any additional methods
}

