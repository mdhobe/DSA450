class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length > 1){
            int[] ans = new int[nums.length];
            k = k % nums.length;
            for(int i=0;i<nums.length;i++){
                if(i + k >= nums.length){
                    ans[k+i-nums.length] = nums[i];
                }
                else
                {
                    ans[k+i] = nums[i];
                }
            }
        
            for(int i=0;i<nums.length;i++){
                nums[i] = ans[i];
            }
        }
    }
}
