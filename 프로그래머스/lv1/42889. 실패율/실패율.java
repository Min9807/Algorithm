import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int len = stages.length;
        int[] answer = new int[N];
        double[] percent = new double[N];
        double tempD = 0;
        int tempI = 0;
        for(int i=0; i<len; i++){ // 각 스테이지 몇개씩 있는지 세는
            if(stages[i]>N) continue;
            answer[stages[i]-1]++;
        }

        for(int i=0; i<N; i++){ // 스테이지 실패율 계산
            int temp = answer[i];
            percent[i] = (double)temp / len;
            len -= temp;
            answer[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                if (percent[j - 1] < percent[j]) {
                    tempD = percent[j - 1];
                    percent[j - 1] = percent[j];
                    percent[j] = tempD;

                    tempI = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tempI;
                }
            }
        }

        return answer;
    }
}