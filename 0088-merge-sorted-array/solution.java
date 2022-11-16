class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1 , j = n - 1 , k = nums1.length - 1;
        // i -> indexing from back of num1
        // j -> indexing from back of num2
        // k -> indexing from back of ( num1 + extra zeroes thing ) .
        while(j >= 0){ // if j = 0 , means num2 array elements are pushed to mum1 array . Everything now sorted 
        
            if(i >= 0 && nums1[i] >= nums2[j]){ // i >= 0 because m can be 0 sometime , than i will become -1 .
                nums1[k--] = nums1[i--] ; // putting num1 value in num1 from back 
            }
            else{
                nums1[k--] = nums2[j--] ; // putting num2 value in num1 from back 
            }
        }
    }
}
