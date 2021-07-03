class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> v ;
        v.push_back(0);
        v.push_back(1);

        if(n==1)return v ;
        return check(v,n,2);
    }
    
    vector<int> check(vector<int> v , int n , int x){
        if(v.size() == powl(2,n) ) return v ;
        int factor = powl(2,x-1);
          
        int l = v.size() - 1 ;
            
        while(l > -1){
            v.push_back(v[l--]+factor);
        }    
        
        return check(v,n,x+1);
    }
};
