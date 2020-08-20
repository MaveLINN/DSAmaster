#include<bits/stdc++.h>

class Solution {
public:
    int findDuplicate(vector<int>& v) {
        sort(v.begin(),v.end());
        const int n = v.size();
        int ret = 0 ;
        
        for(int i = 1 ; i < v.size() ; i++){
            if(v[i-1] == v[i]){
                ret = v[i] ;
                break;
            } 
        }
        
        return ret ; 
    }
};
