class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }

    private int search(int[] nums, int target, int left, int right) {
        //not found
        if(left > right){
            return -1;
        }
        
        //if found
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            return mid;
        }

        //left is sorted
        if(nums[left] <= nums[mid]){

            if(nums[left] <= target && target <= nums[mid]){
                return search(nums, target, left, mid -1);
            }
            else{
                return search(nums, target, mid + 1, right);
            }
        }

        //right is sorted
        else{
            if(nums[mid] <= target && target <= nums[right]){
                return search(nums, target, mid + 1, right);
            }
            else{
                return search(nums, target, left, mid - 1);
            }
        }
    }
         
}
