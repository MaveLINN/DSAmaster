class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> d = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        int n = senate.length() ;
        for(int i = 0;i<n; i++){
            if(senate.charAt(i) == 'D') d.offer(i);
            else r.offer(i);
        }

        while(d.size() > 0 && r.size() > 0){
            int dval = d.remove();
            int rval = r.remove();

            if(dval < rval)d.offer(dval+n);
            if(rval < dval)r.offer(rval+n);

        }

        return d.size() != 0 ? "Dire" : "Radiant" ;  
    }
}
