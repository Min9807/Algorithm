class Solution {
    
    private char calcu(char c, int i){
        if(!Character.isAlphabetic(c)) return c;
        
        return i%2==0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
    }
    
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] == ' '){
                count = -1;
            }
            sb.append(calcu(chars[i], count));
            count++;
        }
        
        return sb.toString();
    }
}