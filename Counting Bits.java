class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            String str = Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '1'){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
