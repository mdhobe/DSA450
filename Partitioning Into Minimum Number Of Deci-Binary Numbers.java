class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        
        for(int i=0;i<n.length();i++){
            int c = Integer.parseInt(""+n.charAt(i));
            if(c > ans){
                ans = c;
            }
        }
        
        return ans;
    }
}
