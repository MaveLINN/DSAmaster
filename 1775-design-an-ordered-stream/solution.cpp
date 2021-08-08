class OrderedStream {
public:

  string v[1001] ;
    int idx = 1 ;
    OrderedStream(int n) {
    }
    
    vector<string> insert(int idKey, string value) {
        vector<string> res ;
        
        v[idKey] = value ;
        while(idx < 1001){
            if(v[idx] == "")return res ;
            else res.push_back(v[idx++]);
        }
       return res ; 
    }
};

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream* obj = new OrderedStream(n);
 * vector<string> param_1 = obj->insert(idKey,value);
 */
