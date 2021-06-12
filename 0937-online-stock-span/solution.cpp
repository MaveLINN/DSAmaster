class StockSpanner {
public:
    stack<pair<int,int>> s ;\
    int idx = 1 ;
    StockSpanner() {
        
    }
    
    int next(int price) {
        
        int ret = 1 ;
        
        if(s.size() == 0){
            ret = 1 ;
            s.push({price,idx++});
        }
        else if(s.size() > 0 && s.top().first > price){
            ret = idx - s.top().second ;
            s.push({price,idx++}) ;
        }
        else if(s.size() > 0 && s.top().first <= price){
            while(s.size() > 0 && s.top().first <= price)s.pop();
            
            if(s.size() == 0){
            ret = idx ;
            s.push({price,idx++});
            }
            else { ret = idx - s.top().second ; s.push({price,idx++}); } 
        }

        return ret ;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */
