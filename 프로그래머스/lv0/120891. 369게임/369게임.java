class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = String.valueOf(order);
        String[] ary = a.split("");
        for(int i=0; i<ary.length; i++){
            if(ary[i].equals("3") | ary[i].equals("6") | ary[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}