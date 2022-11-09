import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


public class BurgerGetReceiptTest {

    @Test
    public void burgerGetReceiptTest() {
        Burger burger = new Burger();
        Bun bun = new Bun("Красная", 75F);
        burger.setBuns(bun);
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "Филе", 91F));
        Assert.assertEquals(burger.getReceipt(), String.format("(==== %s ====)%n", bun.getName())
                + String.format("= %s %s =%n", IngredientType.SAUCE.toString().toLowerCase(), "Филе")
                + String.format("(==== %s ====)%n", bun.getName())
                + String.format("%nPrice: %f%n", burger.getPrice()));
    }
}
