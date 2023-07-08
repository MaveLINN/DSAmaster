class Solution {
    public int longestOnes(int[] a, int k) {

        int n = a.length ;

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(a[i]);
        }

        list.add(0);

        // for(Integer i : list)
        //  System.out.print(i + " ");

        int cur = 0 , l = 0 , r = 0 , res = 0 ;

        while(r < n+1){
            while( r < n+1 && cur <= k){
                if(list.get(r) == 0){
                    cur++;
                }
                r++ ;
            }

            res = Math.max(res,r-l-1);

            if( list.get(l) == 0){
                cur-- ;
            }
            l++ ;

        }


        return res ;
        
    }
}
