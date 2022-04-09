class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int item : nums){
            if(map.containsKey(item)){
                int count = map.get(item);
                map.put(item, count+1);
            }
            else{
                map.put(item, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        return 1;
    }
}
