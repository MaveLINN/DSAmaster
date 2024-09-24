class Solution {
    class Pair{
        int x ;
        int y ;
            Pair(int x , int y){
                this.x = x;
                this.y = y ;
            }
    }

    public void setZeroes(int[][] mat) {
    List<Pair> points = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 0){
                    Pair p = new Pair(i,j);
                    points.add(p);
                }
            }
        }

        for(int i = 0 ; i < points.size() ; i++){
            int x = points.get(i).x;
            for(int j = 0 ; j < n ; j++)
                mat[x][j] = 0 ;
        }

        for(int i = 0 ; i < points.size() ; i++){
            int y = points.get(i).y;
            for(int j = 0 ; j < m ; j++)
                mat[j][y] = 0 ;
        }
    }
}
