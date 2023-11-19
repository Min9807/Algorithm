class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int j=16; j>=0; j--) {
                if(arr1[i] >= Math.pow(2, j)) {
                    sb1.append("#");
                    arr1[i] -= Math.pow(2, j);
                } else {
                    sb1.append(" ");
                }
                if(arr2[i] >= Math.pow(2, j)) {
                    sb2.append("#");
                    arr2[i] -= Math.pow(2, j);
                } else {
                    sb2.append(" ");
                }
            }
            String str1 = sb1.toString().substring(17-n, 17);
            String str2 = sb2.toString().substring(17-n, 17);
            StringBuilder sb = new StringBuilder(compareStr(str1, str2));
            while(sb.length() < n) {
                sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    
    private String compareStr(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int len = Math.max(str1.length(), str2.length());
        for(int i=0; i<len; i++) {
            if(str1.length() > i && str2.length() > i) {
                if(str1.charAt(i) == '#' || str2.charAt(i) == '#') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            } else if(str1.length() > i && str2.length() <= i) {
                if(str1.charAt(i) == '#') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            } else if(str1.length() <= i && str2.length() > i) {
                if(str2.charAt(i) == '#') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}