class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = position[position.length-1];

        int ans = 0;
        while(low <= high){
            int mid = low +(high - low)/ 2;
            if(isPosible(position, m, mid)){
                ans = mid;
                low = mid + 1;   //you need max value 
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPosible(int[] position, int m, int mid){
        int Ballcount = 1;
        int Lastpos = position[0];
        for(int i = 0; i<position.length; i++){
            if(position[i] - Lastpos  >= mid){
                Lastpos = position[i];
                Ballcount++;
            }
        }
        return Ballcount >= m;
    }
}