import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomObjectTest {

    CustomObject co;

    @Before
    public void setUp() throws Exception {
        co = new CustomObject(3, "Vroom");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Vroom!!", co.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        co.upgradeSpeed();
        co.upgradeSpeed();
        co.downgradeSpeed();
        assertEquals(5, co.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        co.upgradeSpeed();
        assertEquals(4, co.getSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        co.downgradeSpeed();
        assertEquals(2, co.getSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, co.getPrice());
    }
}
