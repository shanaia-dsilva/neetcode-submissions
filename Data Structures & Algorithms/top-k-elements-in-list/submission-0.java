class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int f=0;
            map.merge(nums[i],1, (a,b)->a+1);
        }
        List<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue()-a.getValue());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
        result[i] = list.get(i).getKey();
        }
        return result;
    }
}

