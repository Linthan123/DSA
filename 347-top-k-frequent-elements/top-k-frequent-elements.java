class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket = new List[nums.length +1];
        Map<Integer, Integer> map = new HashMap<>();

        //add elemests in a map
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //add key into a bucket
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
               bucket[frequency] = new ArrayList<>(); 
            }
            bucket[frequency].add(key);
        }

        //traversel bucket from left side
        int [] res =  new int[k];
        int count = 0;

        for(int pos = bucket.length-1; pos >=0 && count < k; pos--){
            if(bucket[pos] != null){
                for(Integer integer : bucket[pos]){
                    res[count++] = integer;
                }
            }
        }
        return res;
    }      
}
