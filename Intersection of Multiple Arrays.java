class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> allnumbers = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                   if(allnumbers.containsKey(nums[i][j])){
                       Integer v = allnumbers.get(nums[i][j]);
                       allnumbers.put(nums[i][j], v+1);
                   }
                    else{
                        allnumbers.put(nums[i][j], 1);
                    }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : allnumbers.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if(v == nums.length){
                ans.add(k);
            }
	    }
        
        Collections.sort(ans);
        
        return ans;
    }
}
