package recipe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import recipe.model.RecipeDto;
import recipe.model.RecipeEntity;
import recipe.model.RecipeRepository;
import recipe.service.RecipeService;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class RecipeServiceTest {

    @Mock
    RecipeRepository repository;

    @InjectMocks
    RecipeService subject;

    @Test
    void addRecipeTest() throws Exception {

        RecipeDto recipeDto1 = new RecipeDto(
                "Orange Juice",
                "Orange"
        );
        subject.addRecipe(recipeDto1);

        verify(repository).save(
                new RecipeEntity(
                        "Orange Juice",
                        "Orange"
                )
        );

    }
}
