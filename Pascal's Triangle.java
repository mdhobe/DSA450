class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mylist = new ArrayList<>();
        if(numRows == 1){
            ArrayList<Integer> myarray = new ArrayList<>();
            myarray.add(1);
            
            mylist.add(myarray);
        }else{
            ArrayList<Integer> myarray = new ArrayList<>();
            myarray.add(1);
            
            mylist.add(myarray);
            
            for(int i=1;i<numRows;i++){
                ArrayList<Integer> myarrays = new ArrayList<>();
                myarrays.add(1);
                
                for(int j=0;j<i-1;j++){
                    myarrays.add(mylist.get(i-1).get(j) + mylist.get(i-1).get(j+1));
                }
                
                myarrays.add(1);
                mylist.add(myarrays);
            }
        }
        return mylist;
    }
}
