class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int c = capacity;
        int prev = 0;
        
        for(int i=1;i<plants.length+1;i++){
            if(c >= plants[i-1]){
                c -= plants[i-1];
                ans += i - prev;
                prev = i;
            }
            else{
                c = capacity;
                ans += 2*i-1;
                prev = i;
                i--;
            }
        }
        
        return ans;
    }
}
