class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k >= nums.length) k = k % nums.length ;
        arrayRotate(nums,0,nums.length-1);
        arrayRotate(nums,0,k-1);
        arrayRotate(nums,k,nums.length-1);

    }

    public void arrayRotate(int[] a , int l , int r ){
        while(l<r){
            swap(l,r,a);
            l++;r--;
        }
    }

    public void swap(int x ,int y , int[] a){
        a[x] = a[x] + a[y] ;
        a[y] = a[x]-a[y] ;
        a[x] = a[x] - a[y] ;
    }
}
