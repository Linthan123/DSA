class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }

        while(low < high){
            int mid = low +(high - low)/ 2;
            if(isPosible(mid, weights) <= days){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    static int isPosible(int capacity, int[] weights){
        int days = 1;
        int load = 0;
        for(int w : weights){
            if(load + w > capacity){
                days++;
                load = 0;
            }
            load += w;
        }
        return days;
    }
}