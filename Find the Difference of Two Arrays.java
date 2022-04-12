class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        
        for (Integer n : nums1){
            if(!num1.contains(n)){
                num1.add(n);
            }
        }
        for (Integer n : nums2){
            if(!num2.contains(n)){
                num2.add(n);
            }
        }
        
        ArrayList<Integer> common = new ArrayList<>();
        
        for(Integer n1 : nums1){
            if(num2.contains(n1)){
                common.add(n1);
            }
        }
        
        for(Integer n1 : nums1){
            if(common.contains(n1)){
                num1.remove(n1);
            }
        }
        
        for(Integer n2 : nums2){
            if(common.contains(n2)){
                num2.remove(n2);
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(num1);
        ans.add(num2);
        return ans;
    }
}
