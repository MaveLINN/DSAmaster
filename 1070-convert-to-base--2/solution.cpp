class Solution {
public:
    string baseNeg2(int n) {
        string res="";
        if(n==0)return "0";
        while(n != 0){
        if(abs(n)%2){
            res += '1';
            n = (n-1)/-2;
        }
        else {
            res += '0';
            n = n /-2 ;
        }
        }

        reverse(res.begin(),res.end());
        return res ;
    }
};
