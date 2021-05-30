class Solution {
public:
    bool checkZeroOnes(string s) {
        int c1 = 0 , c0 = 0 , res1 = 0 , res0 = 0;
        
        for(auto i : s){
            if( i == '1'){
                c0 = 0 ;
                c1++;
            }
            else{
                 c1 = 0 ;
                 c0++;
            }
         res1 = max(res1 , c1);
         res0 = max(res0 , c0);
        }

        
        return res1 > res0 ;
    }
};
