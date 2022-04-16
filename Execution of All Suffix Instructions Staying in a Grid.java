class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        
        for(int i=0;i<ans.length;i++){
            int possible = 0;
            int current_x = startPos[1];
            int current_y = startPos[0];
            
            for(int j=i;j<s.length();j++){
                if(s.charAt(j) == 'L'){
                    if(current_x-1 >= 0){
                        possible++;
                        current_x--;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'R'){
                    if(current_x+1 < n){
                        possible++;
                        current_x++;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'D'){
                    if(current_y+1 < n){
                        possible++;
                        current_y++;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'U'){
                    if(current_y-1 >= 0){
                        possible++;
                        current_y--;
                    }
                    else{
                        break;
                    }
                }
            } 
            
            ans[i] = possible;
        }
        
        return ans;
    }
}
