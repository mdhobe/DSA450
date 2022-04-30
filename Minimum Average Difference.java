class Solution {
    public int minimumAverageDifference(int[] nums) {    
        long first = 0;
        long last = 0;
        for(int num:nums) first+=num;
        
        int index = nums.length-1;
        long min = (long) Math.floor(first/nums.length);
        
        for(int i=nums.length-1;i>0;i--){
            first -= nums[i];
            last += nums[i];
            long diff = Math.abs((long) Math.floor(first/i) - (long) Math.floor(last/(nums.length-i)));
            if(diff <= min){
                min = diff;
                index = i-1;
            }
        }
        
        return index;
    }
}
