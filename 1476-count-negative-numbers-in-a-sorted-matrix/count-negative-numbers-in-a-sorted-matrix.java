class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int i = 0;
        while(i<grid.length){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}