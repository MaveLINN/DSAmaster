class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int res = 0 , k = c.length - 1 ; // k is used to calculate the power value , right to left power value decrease 

        for(int i = 0 ; i < c.length ; i++){
            res += ((int)c[i] - 64 )*Math.pow(26,k--);
        }
        return res ;


        // eg.
        // s = "ABA" -> 1*(26^2) + 2*(26^1) + 1*(26^0)
        // summation of -> value of character * ( 26 ^ position of char.. increase right to left like 2 , 1 , 0).
    }
}
