class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num=i; num<=j; num++){
            String[] a = String.valueOf(num).split("");
            for(int b=0; b<a.length; b++){
                if(String.valueOf(k).equals(a[b])){
                    answer++;
                }
            }
        }
        return answer;
    }
}