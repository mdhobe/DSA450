class Solution {
    public int reverse(int x) {
        try {
          if(x < 0){
                x = Math.abs(x);
                String str = "-";
                String num = "" + x;
                for(int i=num.length()-1;i>-1;i--){
                    str += num.charAt(i);
                }
                return Integer.parseInt(str);
            }
            else{
                String str = "";
                String num = "" + x;
                for(int i=num.length()-1;i>-1;i--){
                    str += num.charAt(i);
                }
                return Integer.parseInt(str);
            }
        }
        catch(Exception e) {
          return 0;
        }
    }
}
