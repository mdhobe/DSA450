class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int c=0;c<s.length();c++){
            if(map.containsKey(s.charAt(c))){
                Integer k = map.get(s.charAt(c));
                map.put(s.charAt(c),k+1);
            }
            else{
                map.put(s.charAt(c),1);
            }
        }
        
        for(int c=0;c<s.length();c++){
            if(map.get(s.charAt(c)) == 1){
                return c;
            }
        }
        
        return -1;
    }
}
