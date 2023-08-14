package DataStructures.arrays;

public class maximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));


    }

    public static int maxSubArray(int[] nums) {
        // A solução ótima para esse problema usa o algoritmo de Kadane
        // Com esse algoritmo, a partir do segundo índice do array verifico se ou ele ou a soma dele com os números
        // anteriores (máximo subarray) é a maior soma, caso em que a a maior soma atual assumirá um dos valores
        // e o máximo global assumirá o seu valor caso esta seja maior que o máximo global

        int globalMaxSum = nums[0];
        int currentMaxSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > currentMaxSum + nums[i]) {
                currentMaxSum = nums[i];
            } else {
                currentMaxSum += nums[i];
            }
            if (currentMaxSum > globalMaxSum) {
                globalMaxSum = currentMaxSum;
            }
        }
        return globalMaxSum;
    }
}
