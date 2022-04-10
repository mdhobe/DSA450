class Solution {
    public String reverseWords(String s) {
        String str = trim(s);
        String[] strs = str.split(" ");
        String ans = "";
        for(int i=strs.length-1;i>-1;i--){
            ans += strs[i];
            if(i > 0){
                ans += " ";
            }
        }
        return ans;
    }
    
    public String trim(String s){
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                start++;
            }
            else{
                break;
            }
        }
        
        int end = 0;
        for(int i=s.length()-1;i>-1;i--){
            if(s.charAt(i) == ' '){
                end++;
            }
            else{
                break;
            }
        }
        String substr1 = s.substring(start,s.length()-end);
        return substr1.replaceAll("\\s+", " ");
    }
}
