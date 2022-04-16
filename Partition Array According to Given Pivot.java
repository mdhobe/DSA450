class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> mlistless = new ArrayList<>();
        List<Integer> mlistgreater = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] > pivot){
                mlistgreater.add(nums[i]);
            }
            else if(nums[i] < pivot){
                mlistless.add(nums[i]);
            }
        }
        
        int[] ans = new int[nums.length];
        
        for(int i=0;i<mlistless.size();i++){
            ans[i] = mlistless.get(i);
        }
        
        int pivotLenght = mlistless.size();
        for(int i=0;i<nums.length-mlistless.size()-mlistgreater.size();i++){
            ans[pivotLenght+i] = pivot;
        }
        
        pivotLenght = nums.length-mlistgreater.size();
        
        for(int i=0;i<mlistgreater.size();i++){
            ans[pivotLenght+i] = mlistgreater.get(i);
        }
        
        return ans;
    }
}
