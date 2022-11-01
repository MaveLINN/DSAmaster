class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp = new HashMap<>(){  
          {   
            put('I',1) ; put('V',5) ; put('X',10); put('L',50);
            put('C',100) ; put('D',500) ; put('M',1000);
          } 
        };
        int res = 0 ;
        for(int i = 0 ; i < s.length() ; i++){

            int value = mp.get(s.charAt(i)) ; 

            if(i+1 < s.length()){  // this condition is for skip the last character ( i + 1 issue at last .)
                if(value < mp.get(s.charAt(i+1)))
                    res -= value ;
                else res += value ;
            }
            else res += value ;

        }
        return res ;
    }
}


            // else res += mp.get(s.charAt(i)) ;
