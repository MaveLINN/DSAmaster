class Solution {
public:
    string largestOddNumber(string num) {
        const int n = num.size();
        while(num.size()){
            if((num.back()-'0')%2)return num;
            else num.pop_back();
        }
        return num ;
    }
};
