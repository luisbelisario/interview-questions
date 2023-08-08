package DataStructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution2 {
    public static void main(String[] args) {
        // if we are sure that the array is ordered we can do it as specified above

        int[] nums = {1, 2, 4, 9};
        int target = 8;

        boolean result = twoSum(nums, target);
        System.out.println(result);
    }

    private static boolean twoSum(int[] nums, int target) {
        int minorCounting = 0;
        int majorCounting = nums.length - 1;
        while(minorCounting < majorCounting) {
            // first i´ll sum the numbers of the array in both positions
            int sum = nums[majorCounting] + nums[minorCounting];
            // while minorCounting is lower than majorCounting I´ll check the options below
            if(sum == target) {
                return true;
                // if the sum is equal to the target returns true, end of story
            }
            if(sum < target) {
                minorCounting++;
                // if the sum is smaller than the target i´ll increase the lowest value to increase the sum
                // and maybe reach the target
            }
            if(sum > target) {
                majorCounting--;
                // if the sum is smaller than the target i´ll decrase the biggest value to decrease the sum
                // and maybe reach the target
            }
        }
        return false;
    }
}