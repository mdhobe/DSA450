class Solution {
    public int subtractProductAndSum(int n) {
        String num = "" + n;
        int add = 0;
        int prod = 1;
        
        for(int i=0;i<num.length();i++){
            add += Integer.parseInt(""+num.charAt(i));
            prod *= Integer.parseInt(""+num.charAt(i));
        }
        
        return prod - add;
    }
}
