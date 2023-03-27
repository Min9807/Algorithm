class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] num = Integer.toString(n, 3).split("");
        for(int i=0; i<num.length/2; i++){
            String temp =num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = temp;
        }
        String number="";
        for(String a : num){
            number+=a;
        }
        answer = Integer.parseInt(number, 3);
        return answer;
    }
}