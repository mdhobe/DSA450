class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String str = "";
        for(int i=0;i<strs.length;i++){
            str += reverseString(strs[i]);
            if(i < strs.length-1){
                str += " ";
            }
        }
        return str;
    }
    
    String reverseString(String s){
        String str = "";
        for(int i=s.length()-1;i>-1;i--){
            str += s.charAt(i);
        }
        return str;
    }
}
