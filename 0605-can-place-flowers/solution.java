class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        
        int ct = 0 ; 
        int p = n ;

        
        List<Integer> li = new ArrayList<>();
        li.add(0);

        for(int i = 0 ; i < a.length ; i++){
            li.add(a[i]);
        }

        li.add(0);
        
        for(int i = 0 ; i < li.size() ; i++){

            if(li.get(i) == 0) ct++ ;
            else ct = 0 ;

            if(ct == 3){
                if(p == 0) break; p-- ; ct = 1 ; }
        }
        System.out.println(p);
        if(p == 0) return true ;
        return false ;
    }
}
