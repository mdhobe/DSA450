class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> myhash = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(myhash.containsKey(nums[i])){
                Integer v = myhash.get(nums[i]);
                myhash.put(nums[i],v+1);
            }
            else{
                myhash.put(nums[i],1);
            }
        }
        
        for(Integer v : myhash.values()){
            if(v%2 != 0){
                return false;
            }
        }
        
        return true;
    }
}
