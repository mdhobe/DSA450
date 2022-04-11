class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> allWinners = new ArrayList<>();
        List<Integer> allLosers = new ArrayList<>();
        
        for(int i=0;i<matches.length;i++){
            if(!allWinners.contains(matches[i][0])){
                allWinners.add(matches[i][0]);
            }
            if(!allLosers.contains(matches[i][1])){
                allLosers.add(matches[i][1]);
            }
        }
        
        for(Integer loss:allLosers){
            if(allWinners.contains(loss)){
                allWinners.remove(new Integer(loss));
            }
        }
        
        HashMap<Integer,Integer> myhash = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            if(myhash.containsKey(matches[i][1])){
                int v = myhash.get(matches[i][1]);
                myhash.put(matches[i][1],v+1);
            }
            else{
                myhash.put(matches[i][1],1);
            }
        }
        
        List<Integer> ansLosers = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : myhash.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if(v == 1){
                ansLosers.add(k);
            }
        }
        
        Collections.sort(allWinners);
        Collections.sort(ansLosers);
        
        allWinners.sort(Comparator.comparing(Integer::getA));
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(allWinners);
        answer.add(ansLosers);
        
        return answer;
    }
}
