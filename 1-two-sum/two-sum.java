class Solution {
    public int[] twoSum(int[] nums, int target) {
    //    for(int i=0; i<nums.length; i++){
    //     for(int j=i+1; j<nums.length; j++){
    //         if(nums[i] + nums[j] == target){
    //             return new int[]{i, j};
    //         }
    //     }
    //    }
    //    return new int[]{};

    //Optimaal using hashmap
    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
        int com = target - nums[i];
        if(map.containsKey(com)){
            return new int[]{map.get(com), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
    }
}