class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        for(String str : words) ans.add(str);
        for(int i=1;i<ans.size();i++){
            boolean result = isAnagrams(ans.get(i-1),ans.get(i));
            if(result){
                ans.remove(ans.get(i));
                i--;
            }
        }
        return ans;
    }
    
    public boolean isAnagrams(String source, String target){
        HashMap<Character, Integer> sourceMap = new HashMap<>();
        for(int i=0; i < source.length();i++){
            if(sourceMap.containsKey(source.charAt(i))){
                int temp = sourceMap.get(source.charAt(i));
                sourceMap.put(source.charAt(i), ++temp);
            }
            else{
                sourceMap.put(source.charAt(i),1);
            }
        }
        
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for(int i=0; i < target.length();i++){
            if(targetMap.containsKey(target.charAt(i))){
                int temp = targetMap.get(target.charAt(i));
                targetMap.put(target.charAt(i), ++temp);
            }
            else{
                targetMap.put(target.charAt(i),1);
            }
        }
        
        for(char c = 'a'; c <= 'z'; ++c){
            if(sourceMap.get(c) != targetMap.get(c)){
                return false;
            }
        }
        
        return true;
    }
}
