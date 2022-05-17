class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int num : nums1){
            numbers.add(num);
        }
        for(int num : nums2){
            numbers.add(num);
        }
        for(int num : nums3){
             numbers.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : numbers){
            if(isAvaliable(nums1, num) && isAvaliable(nums2, num)){
                ans.add(num);
            }
            else if(isAvaliable(nums2, num) && isAvaliable(nums3, num)){
                ans.add(num);
            }
            else if(isAvaliable(nums1, num) && isAvaliable(nums3, num)){
                ans.add(num);
            }
        }
        return ans;
    }
    public boolean isAvaliable(int[] nums, int num){
        for(int num1 : nums){
            if(num1 == num) return true;
        }
        return false;
    }
}
