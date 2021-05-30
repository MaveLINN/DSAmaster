class Solution {
public:
    double average(vector<int>& salary) {
        int n = salary.size();
        double res = 0 ;
        for(auto i : salary){
            res += i ;
        }
        n-= 2 ;
        
        return ( res - *min_element(salary.begin(),salary.end()) - *max_element(salary.begin(),salary.end()) ) / n ;
    }
};
