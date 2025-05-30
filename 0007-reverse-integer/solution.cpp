class Solution {
public:
    int reverse(int x) {
        int n = x ;
        if(x < 0) n = -1LL*n ;
        long res = 0 ;

        while(n){
        if(res > INT_MAX/10 || res < INT_MIN/10) return 0 ;
            res = res*10 + n%10 ;
            n/=10;
        }

        if(x < 0) res = -1LL*res ;
        return res ;
        
    }
};
