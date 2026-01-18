class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
       List<Integer> result = new ArrayList<>();

       for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
       }

       int count = nums.length / 3;

       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue() > count){
            result.add(entry.getKey());
        }
       }
       return result;
    }
}