class Solution {
    int[] dp = new int[100]; // dp for storing the answer , this is for not to calculating the answer again and again

    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n ; // think for a base condition when n = 1 or n = 2 ,

        if(dp[n] != 0) return dp[n]; // if the answer for that sub problem already exists , then why to find again
        
        dp[n] = climbStairs(n - 1 ) + climbStairs(n-2) ; // if we didn't got the answer in dp array then we need to find that , follow the number of ways to call the function and add the result .
        
        return dp[n] ; //  return the answer for the required n .
    }
}
