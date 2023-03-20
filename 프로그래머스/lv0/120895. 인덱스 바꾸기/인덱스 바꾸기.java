class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] ars = new String[my_string.length()];
        String temp1 = my_string.substring(num1, num1+1);
        String temp2 = my_string.substring(num2, num2+1);
        for(int i=0; i<my_string.length(); i++){
            if(i==num1){
                ars[num1] = temp2;
                continue;
            }
            else if(i==num2){
                ars[num2] = temp1;
                continue;
            }
            ars[i] = my_string.substring(i, i+1);
        }
        StringBuilder sb = new StringBuilder();
        for(String a : ars){
            sb.append(a);
        }
        
        
        return sb.toString();
    }
}