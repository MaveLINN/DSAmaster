class Solution {
public:
    bool isPowerOfThree(int n) {     
        if(n < 1)return false ;
        double ck = (double)log(n)/log(3) ;
        if( powl(3,ceil(ck)) == n)return true ;        
        return false ;
    }     
};
