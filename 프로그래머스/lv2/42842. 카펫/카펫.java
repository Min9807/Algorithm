class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0; // yellow의 x길이
        int y = 0; // yellow의 y길이
        
        // yellow를 구해서 
        while(brown != (x+2) * 2 + (y*2)){
            y++; 
            if((yellow >= y*y) && (yellow % y == 0)){ // yellow가 y축 제곱 이상이고 y의 배수인 경우
                x = yellow/y;
            }
            
        }
        
        return new int[]{x+2, y+2};
    }
}