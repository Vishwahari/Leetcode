class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            // Case 1: nums[i] == 0
            if (nums[i] == 0) {
                result[i] = 0;
            }

            // Case 2: nums[i] > 0 (move right)
            else if (nums[i] > 0) {
                int landingIndex = (i + nums[i]) % n;
                result[i] = nums[landingIndex];
            }

            // Case 3: nums[i] < 0 (move left)
            else {
                int landingIndex = (i + nums[i]) % n;
                if (landingIndex < 0) {
                    landingIndex += n; // fix negative index
                }
                result[i] = nums[landingIndex];
            }
        }

        return result;
    }
}
