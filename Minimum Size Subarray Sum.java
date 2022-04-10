class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int t = nums[i];
            if(target <= t){
                return 1;
            }
            for(int j=i+1;j<nums.length;j++){
                t += nums[j];
                if(target <= t){
                    if(size > j-i+1){
                        size = j-i+1;
                    }
                    break;
                }
            }
        }
        
        if(size == Integer.MAX_VALUE){
            return 0;
        }
        
        return size;
    }
}
