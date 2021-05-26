class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> v ;
        for(int i = left ; i <= right ; i++){
            if(go(i))v.push_back(i);
        }
        return v ;
    }
    
    bool go(int n){
        int cp = n ;
        while(n){
            if(n%10 == 0 || cp%(n%10) != 0)return false ;
            n/=10;
        }
        return true;
    }
};
