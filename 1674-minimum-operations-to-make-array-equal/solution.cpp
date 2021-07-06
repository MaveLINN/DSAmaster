class Solution {
public:
    int minOperations(int n) {
        if(n==1)return 0 ;
        int res = 0 ; 
        for(int i = 0 ; i < n/2 ; i++)
            res += (2*i)+1 ;
       // cout << res ; 
        return res+= (n%2 ? n/2 : 0) ;
    }
};
