class Solution {
    public int minAddToMakeValid(String s) {
            Stack<Character> st = new Stack<>();
            char[] c = s.toCharArray();
            int res = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(') st.push(c[i]);
                else if (st.isEmpty()) {
                    res++;
                } else {
                    st.pop();
                }
            }

            return res + st.size();
    }
}
