import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


import java.util.ArrayList;


@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTest {

    @Mock
    Bun bun;

    @Test
    public void burgerGetPriceWithoutIngredientTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(30F);
        Assert.assertEquals(60F, burger.getPrice(), 0);
    }

    @Test
    public void burgerGetPriceWithIngredientTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(30F);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "Дальневосточная", 50F));
        Assert.assertEquals(110F, burger.getPrice(), 0);
    }
}
