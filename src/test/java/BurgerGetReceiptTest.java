import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static praktikum.IngredientType.SAUCE;

public class BurgerGetReceiptTest {


    @Test
    public void burgerGetReceiptTest() {
        Burger burger = new Burger();
        Bun bun = new Bun("Красная", 75F);
        burger.setBuns(bun);
        burger.addIngredient(new Ingredient(SAUCE, "Филе", 91F));
        Assert.assertEquals(burger.getReceipt(), String.format("(==== %s ====)%n", bun.getName())
                + String.format("= %s %s =%n", SAUCE.toString().toLowerCase(), "Филе")
                + String.format("(==== %s ====)%n", bun.getName())
                + String.format("%nPrice: %f%n", burger.getPrice()));
    }
}
