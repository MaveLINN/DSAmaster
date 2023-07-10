class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : arr){
            mp.put(i,1+mp.getOrDefault(i,0));
        }
        
        Set<Integer>s = new HashSet<>(mp.values());

        if(mp.size() == s.size()) return true ;
        return false ;

    }
}
