class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet <Integer> li = new HashSet<>();
        HashSet <Integer> res = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            
            if(!li.add(nums[i])) res.add(nums[i]);
            
        }
        return new ArrayList<>(res);
    }
}