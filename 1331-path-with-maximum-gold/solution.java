class Solution {
    int row = 0 ;
    int col = 0 ;
    int maxGold = 0 ;

    public int getMaximumGold(int[][] grid) {
        
         row = grid.length;
         col = grid[0].length;
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] > 0){
                    solve(grid,i,j,0);
                }
            }
        }
        
        return maxGold;
    }
    
    public void solve(int[][] grid , int i , int j , int curr){
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == 0) {
        maxGold = Math.max(maxGold,curr);
        return ;
        }
        int cellValue = grid[i][j] ;
        grid[i][j] = 0 ;

        solve(grid,i-1,j,curr + cellValue);
        solve(grid,i+1,j,curr + cellValue);
        solve(grid,i,j-1,curr + cellValue);
        solve(grid,i,j+1,curr + cellValue);
        grid[i][j] = cellValue ;
    }
}

