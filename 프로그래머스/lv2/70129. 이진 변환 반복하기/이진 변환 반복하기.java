class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int sum = 0;
        
        StringBuilder sb = new StringBuilder(s);
        while(!sb.toString().equals("1")){
            count++;
            for(char c : sb.toString().toCharArray()){
                if(c=='0') sum++;
            }
            int len = sb.toString().replaceAll("0", "").length();
            sb.setLength(0);
            sb.append(Integer.toString(len, 2));
        }
        answer[0] = count;
        answer[1] = sum;
        return answer;
    }
}