class Solution {
    public String reverseWords(String s) {
        s+=" ";
        char[] c = s.toCharArray();
        int n = c.length;
        List<String> string_list = new ArrayList<>(); 
        String temp = "";
        for(int i = 0 ; i < n ; i++){
            if((c[i] != 32)){
                temp += c[i];
            }
            else if(temp.length() > 0){
                string_list.add(temp);
                temp = "";
            }
        }
        String res ="";
        int list_size = string_list.size();
        for(int i = list_size - 1 ; i >= 0 ; i--){
            if(string_list.get(i).length() > 0){
                res += string_list.get(i);
                if( i != 0)res += " ";
            }
        }
        return res ;
    }
}
