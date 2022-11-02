class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0] ;
        for(int i = 1 ; i < strs.length ; i++){ // array length mai function bracket nhi hota
            res = check(res,strs[i]);
        }
    return res ;
    }

    String check(String  a , String  b){
        String res = "";
        for(int i = 0 ; i < Math.min(a.length(),b.length()) ; i++){ // string length mai function bracket hota hai 
            if(a.charAt(i) != b.charAt(i))
            break ;
            res += a.charAt(i);
        }
        return res ;
    }
}
