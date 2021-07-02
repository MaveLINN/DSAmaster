#include<bits/stdc++.h>
class Solution {
public:
    int balancedStringSplit(string s) {
        long res = 0 , l = 0 , r = 0 ;
        for(auto i : s){
            if(i == 'L')l++;
            else r++ ;
            
            if(l==r and l != 0){
                res++;
                l=0;r=0;
            }
        }
      return res ;
      
    }
};
