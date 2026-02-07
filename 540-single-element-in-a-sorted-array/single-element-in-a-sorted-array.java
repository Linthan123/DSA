class Solution {
    public int singleNonDuplicate(int[] nums) {
    int low = 0, high = nums.length-1;
    while(low < high){
        int mid = low + (high - low) / 2;

        // force mid to be even
        if(mid % 2 == 1){
            mid--;
        }

        if(nums[mid] == nums[mid + 1]){
            low = mid + 2;   // single element is on the right
        }
        else{
            high = mid;         // single element is at mid or left
        }
    }
    return nums[low];
    }
}