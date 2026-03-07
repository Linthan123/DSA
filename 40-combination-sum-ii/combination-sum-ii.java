class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, result, current);
        return result;
    }
    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> result, List<Integer> current){
            
            //3 Base case
            if(target == 0){ //when after subtarcting from current index value target is 0 add it into list and return it
                result.add(new ArrayList<>(current));
                return;         
            }
            if(start == candidates.length) //when array is empty return it
            return;

            if(target < 0) // when tagret is became negative return it
            return;

            for(int i = start; i<candidates.length; i++){

                //To avaoid the duplicate elements
                if(i > start && candidates[i] == candidates[i - 1])
                continue;

                //Incude
                current.add(candidates[i]);

                //backtrackp
                backtrack(candidates, target - candidates[i], i + 1, result, current);

                //Exclude
                current.remove(current.size() - 1);
            }
    }
}