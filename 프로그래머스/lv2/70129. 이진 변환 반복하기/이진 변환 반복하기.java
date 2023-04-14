class Solution {
    public int[] solution(String s) {
        int count = 0; // 0을 제거한 개수
        int changeNum = 0; // 바뀐 횟수
        
        while(true){
            if(s.equals("1")){
                break;
            }
            
            int countZero = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    countZero++;
                }
            }
            count += countZero;
            s = Integer.toBinaryString(s.length() - countZero);
            changeNum++;
        }
        int[] answer = {changeNum, count};
        return answer;
    }
}