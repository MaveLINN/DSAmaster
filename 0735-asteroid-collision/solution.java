class Solution {
    public int[] asteroidCollision(int[] a) {

        Stack<Integer> st = new Stack<>();
        for(int i : a){

            if(st.size() == 0) st.push(i);
            else if(i > 0) st.push(i) ;
            else if(st.peek() < 0 && i < 0) st.push(i) ;
            else if( (i == Math.abs(st.peek())) || (st.peek() == Math.abs(i))) st.pop() ;
            else{
                if(i<0 && Math.abs(i) > st.peek() ){
                    while(st.size() > 0 && Math.abs(i) > st.peek() && st.peek() > 0)st.pop();
                    if(st.size() == 0) st.push(i);
                    else{
                        //System.out.print(i);
                        if(Math.abs(i) == st.peek()) st.pop() ;
                        else if(Math.abs(i) > st.peek()){
                            st.push(i);
                        }
                    }
                }
                // if(i>0 && i > Math.abs(st.peek())){
                //     while(st.size() > 0 && i > Math.abs(st.peek()))st.pop();
                //     if(st.size() == 0) st.push(i);
                //     else{
                //         if(Math.abs(st.peek()) == i) st.pop() ;
                //     }
                // }
            }

        }

        int[] res = new int[st.size()];
        int k = st.size() ;
        while(!st.empty()){
            res[--k] = st.pop();
        }
        
        return res ;
    }
}

