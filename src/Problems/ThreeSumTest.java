package Problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test cases written for {@link ThreeSum}
 */
public class ThreeSumTest {

    @Test
    public void testNoSum() {
        assertFalse(ThreeSum.threeSum(new int[]{1, 2, 3}));
    }

    @Test
    public void testUniqueSum() {
        assertTrue(ThreeSum.threeSum(new int[]{1, 2, -3}));
    }

    @Test
    public void testReusedNumber() {
        assertTrue(ThreeSum.threeSum(new int[]{1, 1, -2}));
    }
}
