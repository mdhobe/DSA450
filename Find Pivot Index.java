class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(compare(nums,i)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean compare(int[] nums, int index){
        int sum1 = 0;
        for(int i=0;i<index;i++){
            sum1 += nums[i];
        }
        
        int sum2 = 0;
        for(int i=index+1;i<nums.length;i++){
            sum2 += nums[i];
        }
        
        if(sum1 == sum2){
            return true;
        }
        return false;
    }
}
