#define ll long long int 
class Solution {
public:
    ll fib(int N) {
        
        ll res = 1 ; 
        ll a = 1LL*powl(1+sqrt(5),N);
        ll b = 1LL*powl(1-sqrt(5),N);
        ll c = 1LL*powl(2,N)*sqrt(5);
        res = (a - b) / c ;
        return res;
        
    }
};
