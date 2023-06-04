class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int save = 0;
        char[] chars = s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
            int num = 0;
            switch(chars[i]){
                case 'I':
                num = 1;
                break;
                case 'V':
                num = 5;
                break;
                case 'X':
                num = 10;
                break;
                case 'L':
                num = 50;
                break;
                case 'C':
                num = 100;
                break;
                case 'D':
                num = 500;
                break;
                case 'M':
                num = 1000;
                break;
            }
            
            if(num < save){
                answer -= num;
                save = 0;
                continue;
            }
            save = num;
            answer += num;
        }
        return answer;
    }
}