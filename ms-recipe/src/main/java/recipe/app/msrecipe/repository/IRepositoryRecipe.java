package recipe.app.msrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipe.app.msrecipe.entity.Recipe;

public interface IRepositoryRecipe extends JpaRepository<Recipe, Long> {



}
