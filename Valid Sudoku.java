class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = 9;
        
        for(int i=0;i<m;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=0;j<m;j++){
                if(Character.compare(board[i][j], '.') != 0){
                    if(map.containsKey(board[i][j])){
                        return false;
                    }
                    else{
                        map.put(board[i][j],1);
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=0;j<m;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map1.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map1.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map2.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map2.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map3 = new HashMap<>();
        
        for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map3.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map3.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map4 = new HashMap<>();
        
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map4.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map4.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map5 = new HashMap<>();
        
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map5.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map5.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map6 = new HashMap<>();
        
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map6.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map6.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map7 = new HashMap<>();
        
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map7.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map7.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map8 = new HashMap<>();
        
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map8.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map8.put(board[j][i],1);
                    }   
                }
            }
        }
        
        HashMap<Character, Integer> map9 = new HashMap<>();
        
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){
                if(Character.compare(board[j][i], '.') != 0){
                    if(map9.containsKey(board[j][i])){
                        return false;
                    }
                    else{
                        map9.put(board[j][i],1);
                    }   
                }
            }
        }
        
        return true;
    }
}
