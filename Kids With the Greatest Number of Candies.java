class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            if(isLargest(candies, candies[i], extraCandies)){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        
        return ans;
    }
    
    public boolean isLargest(int[] candies, int number, int extraCandies){
        for(int i=0;i<candies.length;i++){
            if(number + extraCandies < candies[i]){
                return false;
            }
        }
        return true;
    }    
}
