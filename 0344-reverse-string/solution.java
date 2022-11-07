class Solution {
    public void reverseString(char[] s) {
        int stringSize = s.length ;

        for(int i = 0 ; i < stringSize/2 ; i++){
            char c = s[i] ;
            s[i] = s[stringSize - 1 - i] ;
            s[stringSize - 1 - i] = c ;
        }
    }
}
