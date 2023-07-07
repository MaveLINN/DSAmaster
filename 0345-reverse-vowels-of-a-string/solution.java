class Solution {
    public String reverseVowels(String s) {
        

        char[] c = s.toCharArray();

        List<Integer> list = new ArrayList<>();
        for(int k = 0 ; k < c.length ; k++){
            if(c[k] == 'a'  || c[k] == 'e' || c[k] == 'i'|| c[k] == 'o'|| c[k] == 'u' || c[k] == 'A'  || c[k] == 'E' || c[k] == 'I'|| c[k] == 'O'|| c[k] == 'U' ){
                list.add(k);
            }
        }

        // 1 4


        for(int i = 0 ; i < list.size()/2 ; i++){
            char temp = c[list.get(i)] ;
            c[list.get(i)] = c[list.get(list.size() - 1 - i)] ;
            c[list.get(list.size() - 1 - i)] = temp ;
        }

        String ss = new String(c);
        return ss ;
    }
}
