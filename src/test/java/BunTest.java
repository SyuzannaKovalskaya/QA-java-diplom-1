import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    private final String bunName;
    private final float bunPrice;

    public BunTest(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }


    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][]{
                {"Флюоресцентная булка R2-D3", 988.0F},
                {"Краторная булка N-200i", 1255.0F},
        };
    }


    @Test
    public void bunGetNameTest() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals(bunName, bun.getName());
    }

    @Test
    public void bunGetPriceTest() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals(bunPrice, bun.getPrice(), 0);
    }
}
