package recipe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.model.RecipeDto;
import recipe.model.RecipeEntity;
import recipe.model.RecipeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public void addRecipe(RecipeDto recipeDto) {
        recipeRepository.save(new RecipeEntity(
                recipeDto.getRecipeName(),
                recipeDto.getIngredients()

        ));
    }

    public List<RecipeDto> getAllRecipe() {
        return recipeRepository.findAll()
                .stream()
                .map(recipeEntity -> new RecipeDto(
                        recipeEntity.getRecipeName(),
                        recipeEntity.getIngredients()

                ))
                .collect(Collectors.toList());
    }
}
