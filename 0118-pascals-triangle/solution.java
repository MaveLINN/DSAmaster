class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < numRows ; i++){
            list.add(0,1); // each time adding 1 in front side and other elements were shifted
            for(int j = 1 ; j < i ; j++){
                list.set(j , list.get(j) + list.get(j+1));
            }
            res.add( new ArrayList<Integer>(list)); // stores the current list value . 
        }
        return res ;
    }
    
}
