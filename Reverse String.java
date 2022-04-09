class Solution {
    public void reverseString(char[] s) {
        int m = s.length;
        for(int i=0; i < m/2;i++){
            char temp = s[i];
            s[i] = s[m-i-1];
            s[m-i-1] = temp;
        }
    }
}
