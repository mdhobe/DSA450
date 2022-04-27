class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder br = new StringBuilder();
        for(int i=0;i<k;i++){
            br.append(words[i]);
            if(i < k - 1){
                br.append(" ");
            }
        }
        return br.toString();
    }
}
