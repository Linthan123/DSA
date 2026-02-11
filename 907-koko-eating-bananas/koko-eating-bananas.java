class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for(int p: piles){
           high = Math.max(high, p); 
        }
        while(low < high){
            int mid = low + (high - low) / 2;

            if(isPossible(mid, piles, h)){
                high = mid;         // try smaller speed
            }
            else{
                low = mid + 1;        // need more speed
            }
        }
        return low;
    }

    private boolean isPossible(int speed, int[] piles, int h) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed;
        }
            return hours <= h;
        }
}