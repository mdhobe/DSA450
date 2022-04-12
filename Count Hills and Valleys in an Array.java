class Solution {
    public int countHillValley(int[] nums) {
        int start = 0;
        int ans = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[start] < nums[i] && nums[i] > nums[i+1]){
                ans++;
                start = i;
            }else if(nums[start] > nums[i] && nums[i] < nums[i+1]){
                ans++;
                start = i;
            }
        }
        return ans;
    }
}
