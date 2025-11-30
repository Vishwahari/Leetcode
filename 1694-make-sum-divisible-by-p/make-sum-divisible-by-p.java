class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long total = 0L;

        for (int x : nums) {
            total += x;
        }

        int r = (int)(total % p);
        if (r == 0) return 0;  // already divisible

        // Map: prefixMod -> latest index of this prefix
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int ans = n + 1;
        long prefix = 0L;

        for (int i = 1; i <= n; i++) {
            prefix = (prefix + nums[i - 1]) % p;
            int cur = (int) prefix;

            // We want pre[l] == (cur - r + p) % p
            int need = (cur - r) % p;
            if (need < 0) need += p;

            if (map.containsKey(need)) {
                int l = map.get(need);
                ans = Math.min(ans, i - l);
            }

            // Store/overwrite latest index for this prefix mod
            map.put(cur, i);
        }

        if (ans >= n) return -1;
        return ans;
    }
}
