class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        const int n = arr1.size();
        const int m = arr2.size();
        
        vector<int> hp(1001,0);
        vector<int> res ;
        
        for(auto i : arr1)hp[i]++;
        
        for(int i=0 ; i < m ; i++){
            
                for(int j = 0 ; j < hp[arr2[i]] ; j++)
                    res.push_back(arr2[i]);
            hp[arr2[i]] = 0 ;
        }
        
        for(int i = 0 ; i < *max_element(arr1.begin(),arr1.end()) + 1 ; i++){
                    for(int j = 0 ; j < hp[i]; j++)
                    res.push_back(i);
        }
        
        return res ;
    }
};
