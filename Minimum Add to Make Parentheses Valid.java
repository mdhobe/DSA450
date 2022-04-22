class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> records= new Stack<>();
        
        records.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(records.size() > 0 && records.peek() == '(' && s.charAt(i) == ')'){
                records.pop();
            }
            else{    
                records.push(s.charAt(i));
            }
        }
        
        return records.size();
    }
}
