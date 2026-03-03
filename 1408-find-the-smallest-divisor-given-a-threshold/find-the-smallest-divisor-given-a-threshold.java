class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int a : nums){
            high = Math.max(high, a);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            if(isPosible(nums, mid) <= threshold){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    static int isPosible(int[] nums, int divisor){
        int sum = 0;
        
        for(int n : nums){
            sum += (n + divisor - 1)/ divisor;  //ciel divisor
        }
        return sum;
    }
}