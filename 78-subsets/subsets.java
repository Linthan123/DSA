class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(0, nums, current, result);
        return result;

    }
        private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result){

            result.add(new ArrayList<>(current));

            for(int i = start; i<nums.length; i++){

                //include the element
                current.add(nums[i]);

                //backtrack with new element
                backtrack(i + 1, nums, current, result);

                //Remove the element from list
                current.remove(current.size() -1);
            }
            
        }
}