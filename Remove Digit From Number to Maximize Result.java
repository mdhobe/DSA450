class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder num = new StringBuilder(number);
        ArrayList<Integer> indexes = new ArrayList<>();
        
        for(int i=0;i<number.length();i++){
            if(number.charAt(i) == digit){
                indexes.add(i);
            }
        }
        
        ArrayList<String> possibles = new ArrayList<>();
        
        for(int i=0;i<indexes.size();i++){
            possibles.add(num.substring(0,indexes.get(i))+num.substring(indexes.get(i)+1,num.length()));
        }
        
        Collections.sort(possibles);
        
        return possibles.get(possibles.size()-1);
    }
}
