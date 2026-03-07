class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        List<Integer> current =  new ArrayList<>();

        backtrack(nums, result, current);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result,  List<Integer> current){

        //base case
        if(current.size() == nums.length)
        {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int x : nums){

             // Skip if we get same element
            if(current.contains(x))
            continue;

            //Include or add
            current.add(x);

            //backtrack
            backtrack(nums , result, current);

            //Exclude or remove 
            current.remove(current.size() -1);
        }
    }
}