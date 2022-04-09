class Solution {
    public void rotate(int[][] matrix) {
        int runs = matrix.length;
        for(int j=0;j<runs/2;j++){
            for(int i=0;i<runs-1-2*j;i++){                
                int temp = matrix[runs-1-i-j][j];
                matrix[runs-1-i-j][j] = matrix[runs-1-j][runs-1-i-j];
                matrix[runs-1-j][runs-1-i-j] = matrix[i+j][runs-1-j];
                matrix[i+j][runs-1-j] = matrix[j][i+j];
                matrix[j][i+j] = temp;
                
            }   
        }
    }
}
