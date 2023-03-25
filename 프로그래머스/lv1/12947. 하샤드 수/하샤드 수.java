class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] str = String.valueOf(x).split("");
        int num = 0;
        for(String a : str){
            num += Integer.parseInt(a);
        }
        if(x%num!=0){
            return false;
        }
        return answer;
    }
}