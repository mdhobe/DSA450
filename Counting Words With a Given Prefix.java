class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(String s : words){
            if(s.length() >= pref.length()){
                String p = s.subSequence(0,pref.length()).toString();
                if(pref.equals(p)){
                    ans++;
                }   
            }
        }
        return ans;
    }
}
