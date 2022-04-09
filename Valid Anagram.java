class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        for(int c=0;c<s.length();c++){
            if(map1.containsKey(s.charAt(c))){
                Integer k = map1.get(s.charAt(c));
                map1.put(s.charAt(c),k+1);
            }
            else{
                map1.put(s.charAt(c),1);
            }
        }
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int c=0;c<t.length();c++){
            if(map2.containsKey(t.charAt(c))){
                Integer k = map2.get(t.charAt(c));
                map2.put(t.charAt(c),k+1);
            }
            else{
                map2.put(t.charAt(c),1);
            }
        }
        
        
        if(map1.equals(map2)){
            return true;
        }
        
        
        return false;
    }
}
