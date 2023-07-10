class Solution {
    public int equalPairs(int[][] grid) {
        
        int n = grid.length ;
        int m = grid[0].length ;
        Map<List<Integer>,Integer> mp = new HashMap<>();

        int res = 0 ;
        for(int i = 0 ; i < n ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < m ; j++){
                list.add(grid[i][j]);
            }
            mp.put(list,1+mp.getOrDefault(list,0));        
        }

        for(int i = 0 ; i < n ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < m ; j++){
                list.add(grid[j][i]);
            }

            if(mp.containsKey(list)) res += mp.get(list) ;       
        }



        return res ;
    }
}
