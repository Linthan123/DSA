class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(candidates, target, 0, result, current);
        return result;
    }
    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> result, List<Integer> current){
            
            //Base case
            if(target == 0){
                result.add(new ArrayList<>(current));
                return;
            }
            if(start == candidates.length)
            return;

            if(target < 0)
            return;

            for(int i = start; i<candidates.length; i++){
                //Incude
                current.add(candidates[i]);

                //backtrack
                backtrack(candidates, target - candidates[i], i, result, current);

                //Exclude
                current.remove(current.size() - 1);
            }
    }
}