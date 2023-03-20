class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String a = String.valueOf(num);
        String[] ars = a.split("");
        int count = 0;
        for(String n : ars){
            if(n.equals(String.valueOf(k))){
                return answer;
            }

            count++;

            answer++;
        }
        if(count==ars.length) {
                return -1;
            }
        return answer;
    }
}