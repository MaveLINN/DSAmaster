class Solution {
    public String mergeAlternately(String s1, String s2) {
        
        String s ="";
        
        int k = 0 ;

        while( k < s1.length() || k < s2.length()){

            if(k < s1.length()){
                s += s1.charAt(k);
            }

            if(k < s2.length()){
                s += s2.charAt(k);
            }

            k++;
        }

        return s ;


    }
}
