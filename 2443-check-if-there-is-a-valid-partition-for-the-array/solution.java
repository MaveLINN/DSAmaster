class Solution {
    int[] dp = new int[1000006];
    public boolean validPartition(int[] nums) {
        for(int i = 0 ; i < 1000006 ; i++)
            dp[i] = -1 ;
        return solve(nums,0,nums.length) == 1 ? true : false;    
    }

    public int solve(int[] a , int i , int n){

    if( i >= n ) return 1 ;
    if(dp[i] != -1) return dp[i];

    int x = 0 ;
    int y = 0 ;

    if( i + 1 < n){
        if(a[i] == a[i+1]) x = 1 ;
        else x = 0 ;
    }

    if( i + 2 < n){
        if((a[i] == a[i+1] && a[i+1] == a[i+2]) || ( a[i] + 1 == a[i+1] && a[i+1] + 1 == a[i+2]))
        y = 1 ;
        else y = 0 ;
    }

    return dp[i] = Math.min(1 , x*solve(a,i+2,n) + y*solve(a,i+3,n));
    }
}
