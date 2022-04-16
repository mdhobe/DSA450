class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        
        int prev = 0;
        for(int i=0;i<bank[0].length();i++){
            if(bank[0].charAt(i) == '1'){
                prev++;
            }
        }
        
        for(int i=1;i<bank.length;i++){
            int current = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j) == '1'){
                    current++;
                }
            }
            
            if(current > 0){
                ans += prev*current;
                prev = current;
            }
        }
        
        return ans;
    }
}
