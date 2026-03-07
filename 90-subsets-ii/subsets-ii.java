class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(0, nums, result, current);
        return result;
    }
    private void backtrack(int start, int[] nums, List<List<Integer>> result, List<Integer> current){

        //To avaid dupclicates
        if(result.contains(current))
        return;

        result.add(new ArrayList<>(current));

        for(int i = start; i<nums.length; i++){

            //Include elements
            current.add(nums[i]);

            //backtrack
            backtrack(i + 1, nums, result, current);

            //Exclude
            current.remove(current.size()-1);
        }
        
        
    }
}