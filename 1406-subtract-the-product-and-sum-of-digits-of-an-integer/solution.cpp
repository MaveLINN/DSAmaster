class Solution {
public:
    int subtractProductAndSum(int n) {
        int res = 0 , ans = 1 ;
        while(n){
            res += n%10 ;
            ans *= n%10 ;
            n/=10;
        }
        return ans-res ;
    }
};
