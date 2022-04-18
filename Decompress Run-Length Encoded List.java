class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> myarray = new ArrayList<>();
        
        for(int i=0;i<nums.length;i += 2){
            for(int j=0;j<nums[i];j++){
                myarray.add(nums[i+1]);
            }
        }
        
        int[] ans = new int[myarray.size()];
        for(int i=0;i<myarray.size();i++){
            ans[i] = myarray.get(i);
        }
        return ans;
    }
}
