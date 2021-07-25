class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        const int s = ransomNote.size();
        const int ss = magazine.size();
        
        vector<int> v(26,0);
        
        for(int i = 0 ; i < s ; i++) v[ransomNote[i]-'a']++;
        for(int i = 0 ; i < ss ; i++) v[magazine[i]-'a']--;
        
        for(int i = 0 ; i < 26 ; i++){
            cout << v[i] << " " ;
            if(v[i] > 0)return false;
        }
        return true ;
    }
};
