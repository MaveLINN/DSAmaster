class Solution {
public:
    void moveZeroes(vector<int>& v) {
        
        int k = 0 ;
        for(auto i : v){
            if(i)v[k++]=i;
        }
        for(int i = k ; i < v.size() ; i++)v[i]=0;
        
    }
};
