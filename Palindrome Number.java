class Solution {
    public boolean isPalindrome(int x) {
        if(x > -1){
            String br = ""+x;
            System.out.println(br);  
            
            for(int i=0;i<br.length()/2;i++){
                if(br.charAt(i) != br.charAt(br.length()-i-1)){
                    return false;
                }
            }
            
            return true;
        }
        return false;
    }
}
