class Solution {
public:
    string decodeString(string s) {
        
    stack<char> st ;

    for(int i = 0 ; i < s.size() ; i++){

        if(s[i] != ']'){
            st.push(s[i]);
        }
        else{
            string ss ="";

            while(st.size() > 0 && st.top() != '[') {
                ss += st.top(); st.pop();
            }
            reverse(ss.begin(),ss.end());
            st.pop();
            
            int x = 1 ;
            string num="";
            while(st.size() > 0 && st.top() >= 48 && st.top() <= 57){
                num += st.top() ; st.pop();
            }

            reverse(num.begin(),num.end());

            x = stoi(num);

            for(int i = x ; i > 0 ; i--){
                for(int j = 0 ; j < ss.size() ; j++){
                    st.push(ss[j]);
                }
            }

        }
    }

    
        string res="";
        while(st.size() > 0){
            res += st.top();st.pop();
        }

        reverse(res.begin(),res.end());

        return res ;

    }
};

