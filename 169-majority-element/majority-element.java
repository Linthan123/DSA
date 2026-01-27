class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > majorityCount){    // Check if this element is the majority
                return entry.getKey();
            }
        }
        return -1;  // This line will never be reached due to problem guarantee
    }
}