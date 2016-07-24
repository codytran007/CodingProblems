package Problems;

import Utils.Point;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an n by m matrix of 0s and 1s,
 * return the number of islands in the matrix
 * (an island is a group of ones connected
 * horizontally and/or vertically)
 */
public class IslandCount {
    public static int islandCount(int[][] arr) {
        if (!(arr.length > 0 && arr[0].length > 0)) {
            return 0;
        }

        int numIslands = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    System.out.println("numIslands: " + numIslands);
                    printMatrix(arr);

                    numIslands++;
//                    markIsland(arr, i, j);
                    markIsland2(arr, i, j);

                    printMatrix(arr);
                }
            }
        }
        return numIslands;
    }

    public static void markIsland(int[][] arr, int i, int j) {
        arr[i][j] = 0;
        if (isPtAOne(arr, i + 1, j)) markIsland(arr, i + 1, j);
        if (isPtAOne(arr, i - 1, j)) markIsland(arr, i - 1, j);
        if (isPtAOne(arr, i, j + 1)) markIsland(arr, i, j + 1);
        if (isPtAOne(arr, i, j - 1)) markIsland(arr, i, j - 1);
    }

    public static void markIsland2(int[][] arr, int i, int j) {
        Queue<Point> islandParts = new LinkedList<>();
        islandParts.add(new Point(i, j));
        while (!islandParts.isEmpty()) {
            Point pt = islandParts.poll();
            arr[pt.getX()][pt.getY()] = 0;
            int[] deltaX = {0, 0, -1, 1};
            int[] deltaY = {-1, 1, 0, 0};
            for (int k = 0; k < 4; k++) {
                if (isPtAOne(arr, i + deltaX[k], j + deltaY[k])) {
                    markIsland(arr, i + deltaX[k], j + deltaY[k]);
                }
            }
        }
    }

    private static boolean isPtAOne(int[][] arr, int i, int j) {
        if (!(i >= 0 && i < arr.length)) return false;
        else if (!(j >= 0 && j < arr[0].length)) return false;
        else return arr[i][j] == 1;
    }

    private static void printMatrix(int[][] arr) {
        if (!(arr.length > 0 && arr[0].length > 0)) return;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
