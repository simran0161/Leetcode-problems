class Solution {
    public int solve(int i, int j,int[][] obstacleGrid,int [][]dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0 || obstacleGrid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        return dp[i][j]=solve(i-1,j,obstacleGrid,dp)+solve(i,j-1,obstacleGrid,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]dp=new int[m][n];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }

        // // If starting or ending cell is blocked, return 0
        // if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
        //     return 0;
        // }

        // // Initialize starting cell
        // dp[0][0] = 1;

        // // First column
        // for (int i = 1; i < m; i++) {
        //     if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) {
        //         dp[i][0] = 1;
        //     }
        // }

        // // First row
        // for (int j = 1; j < n; j++) {
        //     if (obstacleGrid[0][j] == 0 && dp[0][j - 1] == 1) {
        //         dp[0][j] = 1;
        //     }
        // }

        // // Rest of the grid
        // for (int i = 1; i < m; i++) {
        //     for (int j = 1; j < n; j++) {
        //         if (obstacleGrid[i][j] == 0) {
        //             dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        //         }
        //         // else dp[i][j] stays 0
        //     }
        // }

        // return dp[m - 1][n - 1];


        return solve(m-1,n-1,obstacleGrid,dp);

    }
}