class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        //convert all even numbers to 0 and odd numbers to 1
        //because once its done now its became subarray sum equals to k problem(prefix sum)
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        //count the subarray sum equals to k
        for(int i= 0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}