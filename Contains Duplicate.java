class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int item : nums){
           if(map.containsKey(item)){
                return true;
           }
            else{
                map.put(item, 1);
            }
        }
        
        return false;
    }
}
