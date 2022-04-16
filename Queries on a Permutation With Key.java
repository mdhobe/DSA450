class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> mlist = new ArrayList<>();
        for(int i=1;i<=m;i++) mlist.add(i);
        
        int[] ans = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int item = queries[i];
            int position = getPosition(mlist,item);
            ans[i] = position;
            
            mlist.remove(new Integer(item));
            mlist.add(0,item);
        }

        return ans;
    }
    
    public int getPosition(List<Integer> mlist, int item){
        for(int i=0;i<mlist.size();i++){
            if(mlist.get(i) == item){
                return i;
            }
        }
        return 0;
    }
}
