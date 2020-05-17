class Solution {
public:    
    string largestNumber(vector<int>& v) {
                string ret="";
        if(v.size() == 0)return ret;
        std::vector<string> vs;
for(int i = 0 ; i < v.size() ; i++){
	vs.push_back(to_string(v[i]));
}

sort(vs.begin(), vs.end() , cmp);

for(auto &i : vs)
ret+= i ;
        
        if(ret[0] == '0')ret = "0";
        return ret;
    }
    
     static bool cmp(string x, string y){
        return stoll(x+y) > stoll(y+x);
    }
};
