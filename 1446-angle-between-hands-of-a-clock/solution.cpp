class Solution {
public:
    double angleClock(int hour, int minutes) {
        double res = (5.5)*minutes - 30*hour ;
        if(res < 0) res = 360 + res ;
        
        if(res >= 180) res = 360 - res ;
        return res ;
    }
};
