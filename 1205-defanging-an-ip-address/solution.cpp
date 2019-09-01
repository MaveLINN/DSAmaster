class Solution {
public:
    string defangIPaddr(string address) {
        string res = "";
        for(int i = 0 ; i < address.size() ; i++){
            if(address[i] >= 48 && address[i] <= 57)
                res+=address[i];
            else{
                res+="[.]";
            }
        }
        return res;
    }
};
