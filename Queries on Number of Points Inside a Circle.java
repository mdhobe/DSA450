class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] point = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            int ans = 0;
            int cx = queries[i][0];
            int cy = queries[i][1];
            int r = queries[i][2];
            
            for(int j=0;j<points.length;j++){
                int x = points[j][0];
                int y = points[j][1];

                if(doesLie(cx,cy,r,x,y)){
                    ans++;
                }
            }
            
            point[i] = ans;
            
        }
        
        return point;
    }
    
    public boolean doesLie(int cx, int cy, int r, int x, int y){
        if((cx-x)*(cx-x)+(cy-y)*(cy-y) <= r * r){
            return true;
        }
        return false;
    }
}
