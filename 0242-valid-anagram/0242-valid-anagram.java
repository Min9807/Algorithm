import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(char a : sChar){
            sb1.append(a);
        }
        for(char a : tChar){
            sb2.append(a);
        }

        if(sb1.toString().equals(sb2.toString())){
            return true;
        }

        return false;
    }
}