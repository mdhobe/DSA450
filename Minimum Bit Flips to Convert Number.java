class Solution {
    public int minBitFlips(int start, int goal) {
        String starts = Integer.toBinaryString(start);
        String goals = Integer.toBinaryString(goal);
        
        int s = starts.length();
        int g = goals.length();
        
        if(s > g){
            for(int i=0;i<s - g;i++){
                goals = "0" + goals;
            }
        }
        else if(s < g){
            for(int i=0;i<g - s;i++){
                starts = "0" + starts;
            }
        }
        
        int ans = 0;
        
        for(int i=0;i<starts.length();i++){
            if(starts.charAt(i) != goals.charAt(i)){
                ans++;
            }
        }
        
        return ans;
    }
}
