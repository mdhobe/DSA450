class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for(int i=0;i < digits.length;i++){
            if(digits[i] == 9){
                count++;
            }
        }
        
        if(count == digits.length){
            int[] ans = new int[count+1];
            ans[0] = 1;
            return ans;
        }
        else{
            for(int i=digits.length-1;i >= 0;i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                }
                else{
                    digits[i] += 1;
                    break;
                }
            }
        return digits;   
        }
    }
}
