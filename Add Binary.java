class Solution {
    public String addBinary(String a, String b) {
        String str = "";
        
        int al = a.length();
        int bl = b.length();
        
        if(al > bl){
            for(int i=0;i<al-bl;i++){
                b = "0" + b;
            }
        }
        else{
            for(int i=0;i<bl-al;i++){
                a = "0" + a;
            }
        }
        
        int parity = 0;
        
        for(int i=a.length()-1;i>-1;i--){
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(parity == 1){
                    str = "1" + str;
                    parity = 1; 
                }
                else{
                    str = "0" + str;
                    parity = 1;   
                }
            }
            else if (a.charAt(i) == '1' ||  b.charAt(i) == '1'){
                if(parity == 1){
                    str = "0" + str;
                    parity = 1; 
                }
                else{
                    str = "1" + str;
                    parity = 0;   
                }
            }
            else{
                if(parity == 1){
                    str = "1" + str;
                    parity = 0; 
                }
                else{
                    str = "0" + str;
                    parity = 0;   
                }
            }
        }
        
        if(parity == 1){
            str = "1" + str;
        }
        
        return str;
    }
}
