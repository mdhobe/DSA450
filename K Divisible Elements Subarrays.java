class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<ArrayList> subarray = getSubArray(nums);
        int ans = 0;
        for(ArrayList<Integer> array :subarray){
            int count = 0;
            for(int i=0;i<array.size();i++){
                if(array.get(i)%p == 0){
                    count++;
                }
            }
            if(count <= k) ans++;
        }
        return ans;
    }
    
    public Set getSubArray(int arr[])
	{
        Set<ArrayList> subarray = new HashSet<ArrayList>();
		int n=arr.length;
		for (int i=0; i <n; i++)
		{
			for (int j=i; j<n; j++)
			{
                ArrayList<Integer> subarrays = new ArrayList<>();
				for (int k=i; k<=j; k++)
				{
                    subarrays.add(arr[k]);
				}
                subarray.add(subarrays);
			}
		}
        return subarray;
	}
}
