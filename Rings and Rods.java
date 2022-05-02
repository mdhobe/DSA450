class Solution {
    public int countPoints(String rings) {
        HashMap<Character,HashSet> distribution = new HashMap<>();
        
        for(int i=0;i<rings.length();i+=2){
            if(distribution.containsKey(rings.charAt(i+1))){
                HashSet<Character> colors = distribution.get(rings.charAt(i+1));
                colors.add(rings.charAt(i));
                distribution.put(rings.charAt(i+1), colors);
            }else{
                HashSet<Character> colors = new HashSet<>();
                colors.add(rings.charAt(i));
                distribution.put(rings.charAt(i+1), colors);
            }     
        }
        
        int ans = 0;
        
        for(HashSet<Character> colors:distribution.values()){
            if(colors.size() == 3) ans++;
        }
        
        return ans;
    }
}
