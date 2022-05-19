class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int ans = 0;
        Arrays.sort(special);
        if(bottom != special[0] && ans < special[0] - bottom){
            ans = special[0] - bottom;
        }
        if(special.length > 1){
            for(int i=0;i<special.length-1;i++){
                if(ans < special[i+1] - special[i] - 1){
                    ans = special[i+1] - special[i] - 1;
                }
            }   
        }
        if(top != special[special.length-1] && ans < top - special[special.length-1]){
            ans = top - special[special.length-1];
        }
        return ans;
    }
}
