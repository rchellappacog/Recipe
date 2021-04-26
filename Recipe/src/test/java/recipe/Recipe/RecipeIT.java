package recipe.Recipe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)

public class RecipeIT {
    MockMvc mockMvc;

    @Test
    public void getAllRecipeEmpty() throws Exception {
        mockMvc.perform(get("/recipe"))
                .andExpect(status().isOk());
            //    .andExpect(jsonPath("$.data.length()").value(0))
              //  .andExpect(jsonPath("$.status_code").value(200))
             //   .andDo(document("getAllRaceCarsWhenEmpty"));
    }
}
