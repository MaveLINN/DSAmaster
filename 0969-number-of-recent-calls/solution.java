class RecentCounter {

    Queue<Integer> q = new LinkedList<>();
    int counter = 0 ;
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.offer(t);
        counter++;

        while(q.peek() < t-3000){ q.poll() ; counter-- ;}
        return counter ;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
