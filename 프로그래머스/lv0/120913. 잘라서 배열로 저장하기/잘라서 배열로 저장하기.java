class Solution {
    public String[] solution(String my_str, int n) {
        int answer_size = 0;
        if(my_str.length()%n==0){
            answer_size = my_str.length()/n;
        }
        else{
            answer_size = my_str.length()/n +1;
        }
        String[] answer = new String[answer_size];
        int start = 0;
        int end = n;
        
        for(int i=0; i<answer_size; i++){
            answer[i] = my_str.substring(start, end);
            start += n;
            if(answer_size != my_str.length()/n && i==answer_size-2){
                end += my_str.length()%n;
                continue;
            }
            end += n;
        }
        return answer;
    }
}