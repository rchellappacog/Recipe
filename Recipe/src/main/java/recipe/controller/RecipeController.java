package recipe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import recipe.model.RecipeDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

      List<RecipeDto> recipe1;


      RecipeController() {
            recipe1 = new ArrayList<>();
      }

    @GetMapping
     public List<RecipeDto> getAllRecipeWhenEmpty() { return recipe1; }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecipeDto addRaceCars(@RequestBody RecipeDto recipeDto) {
        recipe1.add(recipeDto);
        return recipeDto;
    }




}
