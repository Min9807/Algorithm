class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String str = "";
        
        if(A.equals(B)){
            return answer;
        }
        for(int i =0; i<A.length(); i++){
            String a = A.substring(B.length()-1 ,B.length());
            A = a + A.substring(0, B.length()-1);
            answer++;
            if(A.equals(B)){
                return answer;
            }
        }
        return -1;
    }
}