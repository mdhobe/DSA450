class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> myhash = new HashMap<>();
        
        for(int i=0;i<indices.length;i++){
            myhash.put(indices[i],s.charAt(i));
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<indices.length;i++){
            ans.append(myhash.get(i));
        }
        
        return ans.toString();
    }
}
