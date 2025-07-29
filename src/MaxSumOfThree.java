public class MaxSumOfThree {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        MaxSumOfThree.SumOfThree(nums);
    }

    public static int SumOfThree(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array must have at least three elements");
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;


        for (int i = 0; i < 3; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;


        for (int i = 3; i < nums.length; i++) {
            currentSum = currentSum - nums[i - 3] + nums[i];


            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
