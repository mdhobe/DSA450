class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        HashMap<Integer,String> seq = new HashMap<>();
        
        for(String str : words){
            seq.put(Integer.parseInt(
""+str.charAt(str.length()-1)),str.substring(0,str.length()-1));
        }
        
        StringBuilder br = new StringBuilder();
        
        for(String str : seq.values()) br.append(str + " ");
        
        return br.toString().substring(0,br.toString().length()-1);
    }
}
