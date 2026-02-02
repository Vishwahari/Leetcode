class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow==fast){
                break;
            }
        }

        int slowfinal = nums[0];
        while(slow!=slowfinal){
            slow = nums[slow];
            slowfinal = nums[slowfinal];
        }
        return slow;
    }
}