package recipe.app.msrecipe.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

    @Entity
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "recipes")
    public class Recipe {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "recipe_id")
        private Long recipeId;

        @Column(name = "title")
        private String title;

        private String category ;
        private String area;
        private String image;

        @Column(name = "description", columnDefinition = "TEXT")
        private String description;

         @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
         private List<Ingrediant> ingredients;

        // Getters and setters, constructors, and any additional methods

}
