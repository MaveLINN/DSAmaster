class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        if(rows == 0) return false ;
        int cols = matrix[0].length;



        int low = 0 ;
        int high = (rows*cols) - 1 ;

        while(low <= high){
            int mid = low + (high - low)/2 ;

            if(matrix[mid/cols][mid%cols] == target) return true ;

            if(target > matrix[mid/cols][mid%cols] ) low = mid + 1 ;
            else high = mid - 1 ;

        }

        return false ;    
    }
}
