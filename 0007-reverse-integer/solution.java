class Solution {
    public int reverse(int x) {

        int n = x ;
        int res = 0 ;
        if(n < 0) n = -n ;

        while(n > 0){
            if(res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10) return 0 ;
            res = res*10 + n%10 ;
            n/=10;
        }
        if(x < 0) res = -1*res;
        return res ;
    }
}
