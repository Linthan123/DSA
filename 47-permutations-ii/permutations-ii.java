class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> current =  new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, result, current, new boolean[nums.length]);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result,  List<Integer> current , boolean[] used){

        //base case
        if(current.size() == nums.length && !result.contains(current))
        {
            result.add(new ArrayList<>(current));
            return;
        }
            
            for(int i=0; i<nums.length; i++){

             // Skip if we get same element
            if(used[i])
            continue;

            //Include or add
            used[i] = true;
            current.add(nums[i]);

            //backtrack
            backtrack(nums , result, current, used);

            //Exclude or remove 
             used[i] = false;
            current.remove(current.size() -1);
        }
    }
}