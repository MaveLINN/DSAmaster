class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        String check = strs[0];
        int n = strs.length;
        for(int i = 1 ; i < n ; i++){
            check = commonPartition(check,strs[i]);
        }
        return check;
    }

    public String commonPartition(String s1 , String s2){
        String check ="";
        for(int i = 0 ; i < Math.min(s1.length(),s2.length()) ; i++){
            if(s1.charAt(i) == s2.charAt(i))
            check += s1.charAt(i);
            else break;
        }
        return check;
    }
}
