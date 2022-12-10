class Solution {
    public int maximumValue(String[] strs) {
        int res = 0 ;
        for(int i = 0 ; i < strs.length ; i++){
            char[] c = strs[i].toCharArray();
            for(int j = 0 ; j < c.length ; j++){
                if(alpha(c)){
                    res = Math.max(res,c.length);
                }
                else{
                    int x = Integer.parseInt(strs[i]);
                    res = Math.max(res,x);
                }
            }
        }
        return res ;
    }

    public static boolean alpha(char[] c){
        for(int i = 0 ; i < c.length ; i++){
            if((int)c[i] > 96 && (int)c[i] < 123){
                return true ;
            }
        }
        return false ;
    }
}
