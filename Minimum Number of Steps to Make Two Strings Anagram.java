class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> t1 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(s1.containsKey(s.charAt(i))){
                int v = s1.get(s.charAt(i));
                s1.put(s.charAt(i),v+1);
            }
            else{
                s1.put(s.charAt(i),1);
            }
            
            if(t1.containsKey(t.charAt(i))){
                int v = t1.get(t.charAt(i));
                t1.put(t.charAt(i),v+1);
            }
            else{
                t1.put(t.charAt(i),1);
            }
        }
        int ans = 0;
        for(char i='a';i<='z';i++){
            if(t1.containsKey(i) && s1.containsKey(i)){
                if(t1.get(i) > s1.get(i)){
                    ans += t1.get(i) - s1.get(i); 
                }
            }
            else if(t1.containsKey(i)){
                ans += t1.get(i);
            }
        }

        return ans;
    }
}
