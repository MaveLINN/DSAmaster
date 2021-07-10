class Solution {
public:
    bool squareIsWhite(string coordinates) {
        return ((coordinates[0]-96)+coordinates[1])%2 ? true : false ;
    }
};
