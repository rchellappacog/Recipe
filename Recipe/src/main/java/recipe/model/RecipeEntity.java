package recipe.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String recipeName;
    String ingredients;

    public RecipeEntity(String recipeName, String ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;


    }
}
