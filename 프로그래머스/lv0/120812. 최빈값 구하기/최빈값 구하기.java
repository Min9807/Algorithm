class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        int[][] ary = new int[len][2];
        
        for(int i=0; i<len; i++){
            ary[i][0] = array[i];
            ary[i][1] = 1;
        }
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(array[i] == array[j] && i!=j){
                    ary[i][1] += 1;
                }
            }
        }

        for(int i=0; i<len; i++){
            if(answer<ary[i][1]){
                answer = ary[i][1];
            }
        }
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if((ary[i][0] != ary[j][0]) && (ary[i][1] == answer) &&(ary[j][1] == answer) && i!=j){
                    return -1;
                }
            }
        }
        
        for(int i =0; i<len; i++){
            if(answer == ary[i][1]){
                answer = ary[i][0];
                break;
            }
        }
        
        return answer;
    }
}