class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        
        for(List<String> item : items){
            if(ruleKey.equals("type") && ruleValue.equals(item.get(0))) ans++;
            if(ruleKey.equals("color") && ruleValue.equals(item.get(1))) ans++;
            if(ruleKey.equals("name") && ruleValue.equals(item.get(2))) ans++;
        }
        
        return ans;
    }
}
