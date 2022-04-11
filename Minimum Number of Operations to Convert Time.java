class Solution {
    public int convertTime(String current, String correct) {
        int currentTime = getTimeInSec(current);
        int correctTime = getTimeInSec(correct);
        
        int diff = correctTime - currentTime;
        int count = 0;
        while(diff > 0){
            if(diff >= 60){
                count++;
                diff -= 60;
            }
            else if(diff >= 15){
                count++;
                diff -= 15;
            }
            else if(diff >= 5){
                count++;
                diff -= 5;
            }
            else if(diff >= 1){
                count++;
                diff -= 1;
            }
        }
        
        return count;
    }
    public int getTimeInSec(String time){
        String[] str = time.split(":");
        int t1 = Integer.parseInt(str[0]);
        int t2 = Integer.parseInt(str[1]);
        return t1*60+t2;
    }
}
