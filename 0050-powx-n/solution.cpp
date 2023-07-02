class Solution {
public:
    double myPow(double x, int n) {

        if(n< 0) return 1.0/foo(x,abs(n)); 
        return foo(x,n);
    }

    double foo(double x , int n){
        if(n == 0) return 1.0;

        double res = foo(x,n/2);
        if(n & 1){
            return 1.0*res*res*x;
        }
        
        return 1.0*res*res ;
    }
};
