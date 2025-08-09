class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int res = 0 ;

        for(int i = 0 ; i < n ; i++){
            String check = "";
            for(int j = i ; j < n ; j++){
                check += s.charAt(j);
                res += count(check);
            }
        }
        return res ;
    }

    public int count(String s){
        int[] has = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            has[s.charAt(i) - 'a']++;
        }

        int mx = Integer.MIN_VALUE , mi = Integer.MAX_VALUE ;
        for(int i = 0 ; i < 26 ; i++){
            if(has[i] > 0){
                mx = Math.max(mx,has[i]);
                mi = Math.min(mi,has[i]);
            }
        }

        return mx - mi ;
    }
}
