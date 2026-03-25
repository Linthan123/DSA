class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;

        // Step 1: total sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += grid[i][j];
            }
        }

        // Step 2: if odd → impossible
        if (total % 2 != 0) return false;

        long target = total / 2;

        // Step 3: check horizontal cuts
        long rowSum = 0;
        for (int i = 0; i < m - 1; i++) { // must leave at least one row below
            for (int j = 0; j < n; j++) {
                rowSum += grid[i][j];
            }
            if (rowSum == target) return true;
        }

        // Step 4: check vertical cuts
        long colSum = 0;
        for (int j = 0; j < n - 1; j++) { // must leave at least one column right
            for (int i = 0; i < m; i++) {
                colSum += grid[i][j];
            }
            if (colSum == target) return true;
        }

        return false;
    }
}