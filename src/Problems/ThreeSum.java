package Problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, return true if any sum of three integers from the array is 0.
 */
public class ThreeSum {
    public static boolean threeSum(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int num : arr) {
            if (num == 0) return true;
            else nums.add(num);
        }
        for (int num1 : arr) {
            for (int num2 : arr) {
                if (nums.contains(-1*(num1 + num2))) return true;
            }
        }
        return false;
    }
}
