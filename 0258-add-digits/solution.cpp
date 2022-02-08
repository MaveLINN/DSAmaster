class Solution {
public:
    
    int result(int n){
        int res = 0 ;
        while(n){
            res += n%10 ;
            n/=10;
        }
        
        return res ;
    }
    
    int addDigits(int num) {
        
        while( num > 9){
            num = result(num);
        }
        return num ;
    }
};
