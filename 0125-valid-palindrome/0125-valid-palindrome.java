class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray()){
            if(c==' ') continue;
            sb.append(c);
        }

        if(sb.toString().equals(sb.reverse().toString())) return true;

        return false;
    }
}