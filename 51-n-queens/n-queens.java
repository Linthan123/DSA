class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board, ans, 0);
        return ans;
    }
    private void nqueen(char[][] board, List<List<String>> ans, int row){
       int n = board.length;
        if(row == n){ //base case
            List<String> current = new ArrayList<>();

            //copy 2d char array into list string
            for(int i=0; i<n; i++){
                String str = "";
                for(int j=0; j<n; j++){
                    str += board[i][j];
                }
                current.add(str);
            }
            ans.add(current);
            return;
        }
        for(int j=0; j<n; j++){ //work and call
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';  
                nqueen(board, ans, row + 1);  //recursion
                board[row][j] = '.';           //backtrack
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        //Check row -> east and west
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }

        //Check col -> south and north
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }

        //check NothEast
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        //check SouthEast
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        //check SouthWest
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        //check NorthWest
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
}