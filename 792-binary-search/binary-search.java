class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length -1;
        return binary(nums,target, low, high);
        // if (nums == null || nums.length == 0){
        //     return -1;
        // }
        // while(low <= high){
        //     int mid = (low + high) / 2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(target < nums[mid]){
        //         high = mid - 1;
        //     }else{
        //         low = mid + 1;
        //     }
        // }
        // return -1;
      
    }

      //By using Recursion
         int binary(int[] nums, int target, int low, int high){
            if(low <= high){
                int mid = low + (high - low) /2;

                if(nums[mid]== target){
                    return mid;
                }
                else if(nums[mid] < target){
                    return binary(nums, target, mid + 1, high);
                }
                else{
                    return binary(nums, target, low, mid - 1);
                }
            }
            return -1;
        }
}