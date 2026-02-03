class Solution {
    public int[] searchRange(int[] nums, int target) {

        int one = lowerbound(nums, target);
        if(one == nums.length || nums[one] != target){
            return new int[] {-1, -1};
        }

        int two = upperbound(nums, target) - 1;

        return new int[] {one, two};
    }
        //lower bound
        private int lowerbound(int[] nums, int target){
            int low =0, high = nums.length;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(target > nums[mid]){
                    low = mid + 1;
                }else{
                    high = mid;
            }
            }
            return low;
        }

        //upper bound
        private int upperbound(int[] nums, int target){
            int low =0, high = nums.length;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(target >= nums[mid]){
                    low = mid + 1;
                }else{
                    high = mid;
            }
            }
            return low;
        }
}