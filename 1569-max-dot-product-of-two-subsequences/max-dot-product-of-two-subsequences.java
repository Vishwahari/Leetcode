class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // dp[i][j] => best dot product using nums1[0..i] and nums2[0..j]
        int[][] dp = new int[n][m];

        dp[0][0] = nums1[0] * nums2[0];

        // initialize first row
        for (int j = 1; j < m; j++) {
            int product = nums1[0] * nums2[j];
            dp[0][j] = Math.max(dp[0][j-1], product);
        }

        // initialize first column
        for (int i = 1; i < n; i++) {
            int product = nums1[i] * nums2[0];
            dp[i][0] = Math.max(dp[i-1][0], product);
        }

        // fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                int product = nums1[i] * nums2[j];

                // Option 1: take both current elements (start or continue subsequence)
                int take = product;
                take = Math.max(take, product + dp[i-1][j-1]);

                // Option 2: skip nums1[i]
                int skip1 = dp[i-1][j];

                // Option 3: skip nums2[j]
                int skip2 = dp[i][j-1];

                // take the maximum of all possibilities
                dp[i][j] = Math.max(Math.max(skip1, skip2), take);
            }
        }

        return dp[n-1][m-1];
    }
}
