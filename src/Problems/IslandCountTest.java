package Problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases written for {@link IslandCount}
 */
public class IslandCountTest {
    @Test
    public void testInvalidMatrix() {
        int[][] arr = new int[0][0];
        assertEquals(0, IslandCount.islandCount(arr));
    }

    @Test
    public void testSingleRow() {
        int[][] arr = new int[5][1];
        arr[0][0] = 1;
        arr[2][0] = 1;
        arr[4][0] = 1;
        assertEquals(3, IslandCount.islandCount(arr));
    }

    @Test
    public void testSingleColumn() {
        int[][] arr = new int[1][5];
        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[0][4] = 1;
        assertEquals(3, IslandCount.islandCount(arr));
    }

    /*
    1 1 0 0 1
    1 1 0 1 0
    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 1
     */
    @Test
    public void testRectangularMatrix() {
        int[][] arr = new int[5][5];
        // first island
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        // second island
        arr[4][4] = 1;
        // third island
        arr[4][0] = 1;
        // fourth island
        arr[3][1] = 1;
        assertEquals(4, IslandCount.islandCount(arr));
    }
}
