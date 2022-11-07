import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {

    @Test
    public void ingredientFillingTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Говяжий метеорит (отбивная)", 3000F);
        Assert.assertEquals(IngredientType.FILLING, ingredient.getType());
    }

    @Test
    public void ingredientSauceTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Соус традиционный галактический", 15F);
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
