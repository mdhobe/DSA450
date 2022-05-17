class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String firstString="", secondString="", thirdString="";
        for(int i=0;i<firstWord.length();i++){
            firstString += getNumber(firstWord.charAt(i));
        }
        for(int i=0;i<secondWord.length();i++){
            secondString += getNumber(secondWord.charAt(i));
        }
        for(int i=0;i<targetWord.length();i++){
            thirdString += getNumber(targetWord.charAt(i));
        }
        if(Integer.parseInt(thirdString) == Integer.parseInt(firstString) + Integer.parseInt(secondString)){
            return true;
        }
        return false;
    }
    public int getNumber(char c){
        if(c == 'a'){
            return 0;
        }
        else if(c == 'b'){
            return 1;
        }
        else if(c == 'c'){
            return 2;
        }
        else if(c == 'd'){
            return 3;
        }
        else if(c == 'e'){
            return 4;
        }
        else if(c == 'f'){
            return 5;
        }
        else if(c == 'g'){
            return 6;
        }
        else if(c == 'h'){
            return 7;
        }
        else if(c == 'i'){
            return 8;
        }
        else if(c == 'j'){
            return 9;
        }
        return 0;
    }
}
