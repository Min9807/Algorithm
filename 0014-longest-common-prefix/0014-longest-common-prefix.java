import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs, (v1, v2) -> v1.length() - v2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=strs[0].length(); i++){
            String str = strs[0].substring(0, i);
            boolean check = true;
            for(int j=1; j<strs.length; j++){
                if(!str.equals(strs[j].substring(0,i))){
                    check = false;
                    break;
                }
            }
            if(check){
                sb.setLength(0);
                sb.append(str);
            }
        }
        
        return sb.toString();
    }
}