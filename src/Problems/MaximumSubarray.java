package Problems;

import static Utils.ArrayUtils.*;

/**
 * Given an integer array, return the maximum sum in a subarray of the array.
 */
public class MaximumSubarray {
    public static int maxSum(int[] arr) {
        if (isNonNegative(arr)) return sum(arr);
        else if (isNonPositive(arr)) return max(arr);
        else {
            int curSum = 0;
            int maxSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (curSum + arr[i] > 0) {
                    curSum = curSum + arr[i];
                }
                else {
                    curSum = 0;
                }

                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
            return maxSum;
        }
    }
}
