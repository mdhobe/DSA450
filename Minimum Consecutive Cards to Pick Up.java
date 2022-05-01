class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,ArrayList> numbers = new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(numbers.containsKey(cards[i])){
                ArrayList<Integer> indexes = numbers.get(cards[i]);
                indexes.add(i);
                numbers.put(cards[i],indexes);
            }else{
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                numbers.put(cards[i],indexes);
            }
        }
        HashMap<Integer,ArrayList> morethantwo = new HashMap<>();
        for (Map.Entry<Integer,ArrayList> entry : numbers.entrySet()) {
            Integer k = entry.getKey();
            ArrayList<Integer> v = entry.getValue();
            if(v.size() > 1){
                morethantwo.put(k,v);
            }
	    }
        if(morethantwo.size() == 0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (Map.Entry<Integer,ArrayList> entry : morethantwo.entrySet()) {
            Integer k = entry.getKey();
            ArrayList<Integer> v = entry.getValue();
            System.out.println("Key: " + k + ", Value: " + v);
            for(int i=0;i<v.size()-1;i++){
                if(min > v.get(i+1)-v.get(i)){
                    min = v.get(i+1)-v.get(i);
                    index1 = v.get(i);
                    index2 = v.get(i+1);
                }
            }
	    }
        return index2-index1+1;
    }
}
