class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        
        while(sb.length() > k){
            int renderlength = sb.length()/k;
        
            if(sb.length() % k != 0){
                renderlength++;
            }

            for(int i=0;i<renderlength;i++){
                int sum = 0;
                for(int j=0;j<k;j++){
                    if(i*k+j < sb.length()){
                        sum += Integer.parseInt(""+sb.charAt(i*k+j));
                    }
                }
                ans.append(sum);
            }

            sb = new StringBuilder(ans);
            ans = new StringBuilder();
        }
        
        return sb.toString();
    }
}
