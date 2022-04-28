class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> allow = new ArrayList<>();
        for(int i=0;i<allowed.length();i++){
            if(!allow.contains(allowed.charAt(i))) allow.add(allowed.charAt(i));
        }
        int ans = 0;
        System.out.println(allow);
        for(String word : words){
            int count = 0;
            for(int i=0;i<word.length();i++){
                if(allow.contains(word.charAt(i))) count++;
            }
            if(count == word.length()) ans++;
        }
        return ans;
    }
}
