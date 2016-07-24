package Problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test classes written for {@link MaximumSubarray}
 */
public class MaximumSubarrayTest {

    @Test
    public void testAllNonNegative() {
        assertEquals(15, MaximumSubarray.maxSum(new int[]{1, 2, 3, 4, 5, 0}));
    }

    @Test
    public void testAllNonPositive() {
        assertEquals(-1, MaximumSubarray.maxSum(new int[]{-5, -4, -3, -2, -1}));
    }

    @Test
    public void testMixed() {
        assertEquals(14, MaximumSubarray.maxSum(new int[]{1, -2, 3, 4, 5, -2, 2, 1, -2, 3, -4}));
    }
}
