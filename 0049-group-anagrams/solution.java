class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0 ; i < n ;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(mp.containsKey(s)){
                List<String> list = mp.get(s);
                list.add(strs[i]);
                mp.put(s,list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                mp.put(s,list);
            }
        }

        for(Map.Entry<String,List<String>> e : mp.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}

// aet - eat , tea , ate
// ant - tan , nat ,
// abt - bat
