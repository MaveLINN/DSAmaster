class Solution {
    public int compress(char[] chars) {
        int n = chars.length ;
        if(n==1 ) return 1 ;

        int idx = 0 , cz = 0 ; 

        while(idx < n){

            char c = chars[idx] ;
            int count = 0 ;
            while( idx < n && chars[idx] == c){
                idx++ ;
                count++;
            }

            chars[cz++] = c ;
            
            if(count != 1){
                String s = Integer.toString(count);
                char[] ch = s.toCharArray();
                for(int i = 0 ; i < ch.length ; i++){
                    chars[cz++] = ch[i];
                }
            }
        }
       return cz ;
        
    }
}
