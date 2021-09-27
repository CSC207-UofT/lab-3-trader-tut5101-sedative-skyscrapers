import org.junit.*;

import static org.junit.Assert.*;

public class SampleClassTest {
    SampleClass sc;

    @Before
    public void setUp() throws Exception {
        sc = new SampleClass();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, sc.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        sc.upgradeSpeed();
        assertEquals(101, sc.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        sc.downgradeSpeed();
        assertEquals(99, sc.getMaxSpeed());
    }
}

