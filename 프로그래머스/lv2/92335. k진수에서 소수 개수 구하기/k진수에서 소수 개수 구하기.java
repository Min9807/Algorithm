class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String number = change(n, k);
        String[] result = number.split("0");
        for(String num : result){
            if(!num.isEmpty() && valid(Long.parseLong(num))){
                answer++;
            }
        }
        return answer;
    }
    
    private boolean valid(long n){
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        
        return true;
    }
    
    private String change(int n, int k){
        return Integer.toString(n, k);
    }
}