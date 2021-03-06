class SubrectangleQueries {
    int[][] rectangles;
        
    public SubrectangleQueries(int[][] rectangle) {
        rectangles = new int[rectangle.length][rectangle[0].length];
        
        for(int i=0;i<rectangle.length;i++){
            for(int j=0;j<rectangle[0].length;j++){
                rectangles[i][j] = rectangle[i][j];
            }
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1;i<row2+1;i++){
            for(int j=col1;j<col2+1;j++){
                rectangles[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {        
        return rectangles[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
