class Solution {
public:
    int maximum69Number (int num) {
        int pos = 0 , i = 1 , n = num ;
        
        while(num){
            if(num%10 == 6)pos = i ;
            num/=10;
            i++;
        }
        
        return n+3*powl(10,pos-1);
    }
};
