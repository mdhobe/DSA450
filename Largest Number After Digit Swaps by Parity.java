class Solution {
    public int largestInteger(int num) {
        String str = "" + num;
        String strs = "";     
        
        HashMap<Integer, Integer> even = new HashMap<>();
        HashMap<Integer, Integer> odd = new HashMap<>();
        
        for(int i=0;i<str.length();i++){
            int temp = Integer.parseInt(""+str.charAt(i));
            if(temp % 2 == 0){
                even.put(i,temp);
            }
            else{
                odd.put(i,temp);
            }
            strs += " ";
        }
        
        LinkedHashMap<Integer, Integer> desceven = new LinkedHashMap<>();
    even.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> desceven.put(x.getKey(), x.getValue()));
        
        LinkedHashMap<Integer, Integer> descodd = new LinkedHashMap<>();
    odd.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> descodd.put(x.getKey(), x.getValue()));        
        
        Set<Integer> descevenkeys = desceven.keySet();
        List<Integer> descevenlist = new ArrayList<Integer>(descevenkeys);
        Collections.sort(descevenlist);
        
        Set<Integer> descoddkeys = descodd.keySet();
        List<Integer> descoddlist = new ArrayList<Integer>(descoddkeys);
        Collections.sort(descoddlist);
        
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : desceven.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            String vs = ""+v;
            strs = addChar(strs, vs.charAt(0), descevenlist.get(index));
            index++;
        }
        
        index = 0;
        for (Map.Entry<Integer, Integer> entry : descodd.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            String vs = ""+v;
            strs = addChar(strs, vs.charAt(0), descoddlist.get(index));
            index++;
        }
        
        return Integer.parseInt(strs);
    }
    
    public String addChar(String str, char ch, int position) {
        str = str.substring(0, position) + ch + str.substring(position + 1);
        return str;
    }
}
