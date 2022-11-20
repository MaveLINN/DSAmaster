class Solution {
    public boolean isHappy(int n) {

    Set<Integer> s = new HashSet<>();

     n = sum(n);
    while( n != 1){
          if(s.contains(n))return false ; // it checks whether the current value is present in set , it means if the value is present then it creates a cycle , then it won't become 1 , hence false
          else {
              s.add(n); // if value does not exist , then we need to add the value to set .
              n = sum(n);
          }  
        
    }
    return true ;    // if it becomes 1 , it returns true .
    }

    public int sum(int n){ // it returns the digit square sum .
    int sum = 0 ; 
    while(n > 0){
        int x = n%10 ;
        sum += (x*x);
        n/=10 ;
    }
    return sum ;
    }
}
