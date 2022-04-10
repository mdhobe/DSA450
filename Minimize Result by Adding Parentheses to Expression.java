class Solution {
    public String minimizeResult(String expression) {
        expression = "(" + expression + ")";
        String ans = "";
        int total = Integer.MAX_VALUE;
        
        Integer len1 = expression.split("\\+")[0].length()-1;
        Integer len2 = expression.split("\\+")[1].length()-1;
        
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){     
                String internal = expression.substring(i+1,expression.length()-1-j);
                String[] nums = internal.split("\\+");
                int sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                if(i > 0){
                   sum *= Integer.parseInt(expression.substring(1,i+1));    
                 }
                if(j > 0){
                    sum *= Integer.parseInt(expression.substring(len1+len2-j+2,len1+len2+2));
                }
                if(sum < total){
                    total = sum;
                    if(i > 0 && j > 0){
                        ans = Integer.parseInt(expression.substring(1,i+1)) + "(" + internal + ")" + Integer.parseInt(expression.substring(len1+len2-j+2,len1+len2+2));
                    }
                    else if(i > 0){
                        ans = Integer.parseInt(expression.substring(1,i+1)) + "(" + internal + ")";
                    }
                    else if(j > 0){
                        ans = "(" + internal + ")" + Integer.parseInt(expression.substring(len1+len2-j+2,len1+len2+2));
                    }
                    else{
                        ans = "(" + internal + ")";
                    }
                }
            }
        }
        

        return ans;
    }
    
    public String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
