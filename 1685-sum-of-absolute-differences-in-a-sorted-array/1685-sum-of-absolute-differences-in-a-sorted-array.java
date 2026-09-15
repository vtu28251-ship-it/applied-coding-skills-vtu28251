class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Calculate total sum of array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            // Sum of elements on the right
            int rightSum = totalSum - leftSum - nums[i];

            // Difference with left side
            int leftDifference = nums[i] * i - leftSum;

            // Difference with right side
            int rightDifference = rightSum - nums[i] * (n - i - 1);

            result[i] = leftDifference + rightDifference;

            // Update left sum
            leftSum += nums[i];
        }

        return result;
    }
}