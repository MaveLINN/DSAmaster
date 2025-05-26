class Solution {
public:
    int trap(vector<int>& a) {
    int n = a.size();
    std::vector<int> v_leftMax(n);
    std::vector<int> v_rightMax(n);

    v_leftMax[0] = a[0];
    v_rightMax[n-1] = a[n-1];

    for(int i = 1 ; i < n ; i++){
      v_leftMax[i] = max(v_leftMax[i-1],a[i]);
    }

    for (int i = n - 2 ; i > -1 ; --i){
      v_rightMax[i] = max(v_rightMax[i+1],a[i]);
    }
    

    int water_stored = 0 ;
    for(int i = 0 ; i < n ; i++){
      water_stored += abs( min(v_leftMax[i],v_rightMax[i]) - a[i]);
    }
    return water_stored ;
    }
};
