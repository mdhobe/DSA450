class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            ans[i] = smallerCount(nums, nums[i]);
        }
        
        return ans;
    }
    
    public int smallerCount(int[] nums, int num){
        int ans = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < num){
                ans++;
            }
        }
        
        return ans;
    }
}
