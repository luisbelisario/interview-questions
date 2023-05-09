import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int complementToTarget = target - currentValue;
            if(numsMap.containsKey(complementToTarget)) {
                return new int[] {numsMap.get(complementToTarget), i};
            }
            // if condition above is not valid i'll just add the key (nums[i]) and value (i) to numsMap
            numsMap.put(currentValue, i);
        }
        return new int[]{};
    }
}