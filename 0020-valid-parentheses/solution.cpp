class Solution {
public:
    bool isValid(string s) {
    stack<char>st;
    for(auto i : s){
	if( i == '(' || i == '{' || i =='['){
		st.push(i);
		continue ;
	}

	if(i == ')' && !st.empty() && st.top() == '('){
		st.pop();
		continue;
	}


	if(i == '}' && !st.empty() && st.top() == '{'){
		st.pop();
		continue;
	}

	if(i == ']' && !st.empty() && st.top() == '['){
		st.pop();
		continue;
	}

	if( i == ')' || i == '}' || i ==']'){
		st.push(i);
		break ;
	}
}
        return st.empty();

    }
};
