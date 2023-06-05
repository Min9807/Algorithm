class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if(sb.reverse().toString().equals(String.valueOf(x))){
            return true;
        }
        return false;
    }
}