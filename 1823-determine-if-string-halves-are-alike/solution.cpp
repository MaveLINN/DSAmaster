class Solution {
public:
    bool halvesAreAlike(string s) {
        const int n = s.size();
        int ct = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U'){
            if(i < n/2){
               ct++;
            }
            else ct--;
            }
        }
        

        return ct == 0 ? true : false ;    
    }
};
