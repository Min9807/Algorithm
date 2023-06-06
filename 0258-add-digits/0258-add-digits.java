class Solution {
    public int addDigits(int num) {
        while(String.valueOf(num).length() != 1){
            int k = 0;
            for(String str : String.valueOf(num).split("")){
                k += Integer.parseInt(str);
            }
            num = k;
        }

        return num;
    }
}