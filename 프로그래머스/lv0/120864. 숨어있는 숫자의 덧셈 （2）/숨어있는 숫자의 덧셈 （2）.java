class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ars = my_string.split("");
        for(int i=0; i<ars.length; i++){
        try {
            Integer.parseInt(ars[i]);
        } catch (Exception e) {
            ars[i] = "A";
        }            
        }
        
        String str = ""; 
        for(String a : ars){
            str+=a;
        }
        
        String[] ars1 = str.split("A");
        
        for(String a : ars1){
        try {
            answer += Integer.parseInt(a);
        } catch (Exception e) {
            continue;
        } 
            
        }
        return answer;
    }
}