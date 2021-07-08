class Solution {
public:
    int mySqrt(int x) {
        int res = 0 , i = 1;
        while(i){
            if(x/i >= i)res = i ; 
            else break ;
            i++;
        }
        return res ;
    }
};
