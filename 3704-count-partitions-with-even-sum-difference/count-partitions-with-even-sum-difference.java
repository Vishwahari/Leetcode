class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int total_sum = 0;
        for(int num:nums) total_sum+=num;
        int left_sum = 0;
        
        for(int i =0;i<nums.length-1;i++){
            left_sum+=nums[i];
            int right_sum = total_sum-left_sum;
            if((left_sum%2==0)==(right_sum%2==0)) count++;
        }
        return count;
    }
}