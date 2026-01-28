class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = 1;
        // }
        // for(int i=0; i<nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if( i != j){
        //             arr[i] = arr[i] * nums[j];
        //         }
        //     }
        // }
        // return arr;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        suffix[suffix.length-1] = 1;

        for(int i = 1; i<nums.length; i++){
            prefix[i] = prefix[i -1] * nums[i -1];
        }

        for(int i = nums.length -2; i>=0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for(int i = 0; i<nums.length; i++){
            arr[i] = suffix[i] * prefix[i];
        }
       
        return arr;
    }
}