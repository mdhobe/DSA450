class Solution {
    public boolean isPalindrome(String s) {
        String z = s.replaceAll("[^a-zA-Z0-9]", "");
        String t = z.replaceAll(" ", "").toLowerCase();
        
        for(int i=0;i<t.length()/2;i++){
            if(t.charAt(i) != t.charAt(t.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
