class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int index = 0;
        for(int item=0; item < nums.length; item++){
            if(nums[item] > largest){
                largest = nums[item];
                index = item;
            }
        }
        
        for(int item : nums){
            if(item != largest){
                if(largest < 2*item){
                    return -1;
                }   
            }
        }
        
        return index;
    }
}
