class Solution {
    private static String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int solution(String s) {
        for(int i=0; i<10; i++) {
            s = s.replaceAll(numStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}