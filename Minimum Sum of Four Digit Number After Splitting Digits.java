class Solution {
    public int minimumSum(int num) {
        String str = "" + num;
        int a = Integer.parseInt(""+str.charAt(0));
        int b = Integer.parseInt(""+str.charAt(1));
        int c = Integer.parseInt(""+str.charAt(2));
        int d = Integer.parseInt(""+str.charAt(3));
        
        int[] array = {a,b,c,d};
        
        Arrays.sort(array);
        
        return (array[0]*10 + array[3]) + (array[1]*10 + array[2]);
    }
}
