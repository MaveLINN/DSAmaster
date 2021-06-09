class Solution {
public:
    
    string largestNumber(vector<int>& nums) {
        const int n = nums.size();
        
        vector<string> v ;
        for(auto &i : nums){
            v.push_back(to_string(i));
        }
        
        sort(v.begin() , v.end() , comp);
        string res="";
        for(auto &i : v)
            res += i;
        
        if(res[0] == '0')res = '0';
        
        return res ;
    }
    
        static bool comp(string s1 , string s2){
        return s1+s2 > s2+s1 ;
    }
};
