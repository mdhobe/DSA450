class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        
        if(n == 0){
            return 0;
        }
        else if(n == h){
            if(compare(haystack, needle, 0)){
                return 0;
            }
            else{
                return -1;
            }
        }
        else if(n > h){
            return -1;
        }
        else{
                for(int i=0;i<h;i++){
                    if(compare(haystack, needle, i)){
                        return i;
                    }
                }   
        }
        
        return -1;
    }
    
    public boolean compare(String haystack, String needle, int j){
        try{
            for(int i=0;i<needle.length();i++){
            if(haystack.charAt(j+i) != needle.charAt(i)){
                return false;
            }
        }
        return true;
        }
        catch(Exception e){
            return false;
        }
        
    }
}
