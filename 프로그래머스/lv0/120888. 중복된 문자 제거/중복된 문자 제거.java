class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ary = my_string.split("");
        for(int i=0; i<ary.length; i++){
            for(int j=i+1; j<ary.length; j++){
                if(ary[i].equals(ary[j])){
                    ary[j] = "";
                }
            }
        }
        for(String a : ary){
            answer += a;
        }
        return answer;
    }
}