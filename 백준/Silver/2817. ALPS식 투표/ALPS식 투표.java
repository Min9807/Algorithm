import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        double standard = X * 0.05;

        boolean[] validCandidate = new boolean[26];
        int[] staffVote = new int[26];
        int candidateCount = 0;

        while(N-- > 0){
            char c = sc.next().charAt(0);
            int num = sc.nextInt();
            if(num >= standard){
                int idx = c - 'A';
                validCandidate[idx] = true;
                staffVote[idx] = num;
                candidateCount++;
            }
        }

        Score[] scores = new Score[candidateCount * 14];
        int scoreIndex = 0;
        for(int i=0; i<26; i++){
            if(validCandidate[i]){
                for(int j=1; j<=14; j++){
                    scores[scoreIndex++] = new Score(i, (double)staffVote[i] / j);
                }
            }
        }

        sortScoresDescendingOrder(scores);

        int[] ans = new int[26];

        for(int i=0; i<14; i++){
            ans[scores[i].staffIndex]++;
        }

        for(int i=0; i< 26; i++){
            if(validCandidate[i])
                System.out.println((char)(i+ 'A') + " " + ans[i]);
        }

    }

    public static void sortScoresDescendingOrder(Score[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i].score > arr[j].score) {
                    Score cur = arr[i];
                    for (int k = i; k > j; k--)
                        arr[k] = arr[k - 1];
                    arr[j] = cur;
                }
            }
        }
    }

    private static class Score{
        int staffIndex;
        double score;

        public Score(int staffIndex, double score){
            this.staffIndex = staffIndex;
            this.score = score;
        }
    }

}