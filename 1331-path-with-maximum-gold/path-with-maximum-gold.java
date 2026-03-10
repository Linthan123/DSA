class Solution {

    int maxGold = 0;

    public int getMaximumGold(int[][] grid) {
        int m = grid.length; //row
        int n = grid[0].length;  //first row length  ->  means "grid[0].length"

        boolean[][] isVisited = new boolean[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){

                if(grid[i][j] != 0){
                    path(i, j, grid, isVisited, 0);
                }
            }
        }
        return maxGold;
    }
    private void path(int r, int c, int[][] grid, boolean[][] isVisited, int currGold){

        int m = grid.length;
        int n = grid[0].length;
        
        //Base case
        if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0 || 
        isVisited[r][c])
        return;

        //add the element
        isVisited[r][c] = true;

        currGold += grid[r][c];

        maxGold = Math.max(maxGold, currGold);

        //down path
        path(r + 1 , c, grid, isVisited, currGold);
        
        //right path
        path(r , c + 1, grid, isVisited, currGold);
        
        //left path
        path(r, c - 1, grid, isVisited, currGold);
        
        //up path
        path(r - 1 , c, grid, isVisited, currGold);
        
        //backtracking
        isVisited[r][c] = false;
    }
}