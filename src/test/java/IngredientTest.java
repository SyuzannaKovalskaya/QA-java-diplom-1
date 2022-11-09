import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private IngredientType ingredientType;
    private String ingredientName;
    private float ingredientPrice;


    public IngredientTest(IngredientType ingredientType, String ingredientName, float ingredientPrice) {
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters
    public static Object[][] getIngredientData() {
        return new Object[][]{
                {IngredientType.FILLING, "Говяжий метеорит (отбивная)", 3000F},
                {IngredientType.SAUCE, "Соус традиционный галактический", 15F},
        };
    }

    @Test
    public void ingredientTypeTest() {
        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        Assert.assertEquals(ingredientType, ingredient.getType());
    }

    @Test
    public void ingredientNameTest() {
        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        Assert.assertEquals(ingredientName, ingredient.getName());
    }

    @Test
    public void ingredientPriceTest() {
        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        Assert.assertEquals(ingredientPrice, ingredient.getPrice(), 0);
    }
}
