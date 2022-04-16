class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for(int item : nums){
            if(item > 0){
                positive.add(item);
            }
            else{
                negative.add(item);
            }
        }
        
        int[] ans = new int[nums.length];
        int p = 0, n = 0;
        
        for(int i=0;i<ans.length;i++){
            if(i % 2 == 0){
                ans[i] = positive.get(p);
                p++;
            }
            else{
                ans[i] = negative.get(n);
                n++;
            }
        }
        
        return ans;
    }
}
