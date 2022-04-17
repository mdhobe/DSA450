class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> myhash = new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++){
            if(myhash.containsKey(groupSizes[i])){
                List<Integer> val = myhash.get(groupSizes[i]);
                val.add(i);
                myhash.put(groupSizes[i], val);
            }
            else{
                List<Integer> val = new ArrayList<>();
                val.add(i);
                myhash.put(groupSizes[i], val);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for (Map.Entry<Integer, List<Integer>> entry : myhash.entrySet()) {
            Integer k = entry.getKey();
            List<Integer> v = entry.getValue();
            
            for(int i=0;i<v.size()/k;i++){
                List<Integer> sublist = v.subList(k*i, k+k*i);
                ans.add(sublist);   
            }
	    }
        
        return ans;
    }
}
