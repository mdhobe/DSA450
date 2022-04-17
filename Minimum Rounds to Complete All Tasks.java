class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> myhash = new HashMap<>();
        int ans = 0;
        
        for(int i=0;i<tasks.length;i++){
            if(myhash.containsKey(tasks[i])){
                int v = myhash.get(tasks[i]);
                myhash.put(tasks[i],v+1);
            }
            else{
                myhash.put(tasks[i],1);
            }
        }
        
        for(int v : myhash.values()){
            if(v > 1){
                if(v%3 == 0){
                    ans += v/3;
                }
                else if(v%3 == 2){
                    ans += v/3 + 1;
                }
                else if(v%3 == 1){
                    ans += v/3 + 1;
                }
            }
            else{
                ans = -1;
                break;
            }
        }
        
        return ans;
    }
}
