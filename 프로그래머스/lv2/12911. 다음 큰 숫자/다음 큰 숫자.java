class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String a = Integer.toBinaryString(n);
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='1'){
                count++;
            }
        }
        
        while(true){
            n++;
            String b = Integer.toBinaryString(n);
            int k = 0;
            for(int i=0; i<b.length(); i++){
                if(b.charAt(i)=='1'){
                    k++;
                }
            }
            if(k==count){
                answer=n;
                break;
            }
        }
        
        return answer;
    }
}