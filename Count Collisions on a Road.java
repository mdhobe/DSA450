class Solution {
    public int countCollisions(String directions) {
        StringBuilder direction = new StringBuilder(directions);
        int ans = 0;
        for(int i=1;i<directions.length();i++){
            if(directions.charAt(i-1) == 'R' && directions.charAt(i) == 'L'){
                ans+=2;
                direction.replace(i-1,i+1,"SS");
            }
        }
        
        boolean isSR = false;
        for(int i=direction.length()-1;i>-1;i--){
            if(isSR && direction.charAt(i)=='R'){
                ans++;
            }
            if(direction.charAt(i)=='S'){
                isSR = true;
            }
        }
        
        boolean isSL = false;
        for(int i=0;i<direction.length();i++){
            if(isSL && direction.charAt(i)=='L'){
                ans++;
            }
            if(direction.charAt(i)=='S'){
                isSL = true;
            }
        }
        
        return ans;
    }
}
