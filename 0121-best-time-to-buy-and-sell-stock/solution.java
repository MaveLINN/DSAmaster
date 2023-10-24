class Solution {
    public int maxProfit(int[] p) {

        int[] a = new int[p.length];
        int n = p.length ;
        a[n - 1] = -1 ;
        int mx = p[n - 1] ;

        for(int i = n - 1 ; i >= 0 ; i--){
            mx = Math.max(mx,p[i]);
            a[i] = mx ;
        }

        int res = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++){
            res = Math.max(res,Math.abs(a[i] - p[i]));
        } 


        return  res ; 
    }
}
