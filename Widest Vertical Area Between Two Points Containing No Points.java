class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> arrli= new ArrayList<>();
       HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<points.length;i++){
            int a=points[i][0];
            set.add(a);
            
        }
        for(int i:set)
            arrli.add(i);
        
        Collections.sort(arrli);
        int ans=0;
        for(int i=0;i<arrli.size()-1;i++){
            int b=arrli.get(i+1)-arrli.get(i);
            ans=Math.max(ans,b);
        }
        
        return ans;
    }
}
