package easy;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
            int maxValue = nums[0];
            int currValue;

            for (int i = 0; i < nums.length; i++) {
                currValue = nums[i];
                if (currValue > maxValue) {
                    maxValue = currValue;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    currValue = currValue + nums[j];
                    if (currValue > maxValue) {
                        maxValue = currValue;
                    }
                }
            }

            return maxValue;
    }
}
