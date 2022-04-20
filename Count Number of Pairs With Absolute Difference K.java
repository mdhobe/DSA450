class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i != j){
                    if(nums[i] - nums[j] == k || nums[j] - nums[i] == k) ans++;
                }
            }    
        }
        
        return ans;
    }
}
