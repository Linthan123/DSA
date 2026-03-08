class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;

        for(int i = nums.length - 2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }

        if(idx1 < 0){
            Arrays.sort(nums);
            return;
        }
        else{
            for(int i = nums.length - 1; i>=0; i--){
                if(nums[idx1] < nums[i]  ){
                    idx2 = i;
                    break;
                }
            }
        }

        swap(nums, idx1, idx2);

        Arrays.sort(nums, idx1 + 1, nums.length);
    }

        private  void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}