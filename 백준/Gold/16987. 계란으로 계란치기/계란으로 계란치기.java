import java.util.*;
import java.io.*;
public class Main {
    static Egg[] eggs;
    static int N;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        eggs = new Egg[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int value1 = Integer.parseInt(st.nextToken());
            int value2 = Integer.parseInt(st.nextToken());
            eggs[i] = new Egg(value1, value2);
        }

        dfs(0);
        System.out.println(answer);
    }
    private static void dfs(int idx) {
        if(idx == N) {
            int cnt = 0;
            for(int i=0; i<N; i++) {
                if(eggs[i].durability <= 0) cnt++;
            }
            answer = Math.max(answer, cnt);
            return;
        }

        if(eggs[idx].durability > 0) {
            boolean check = false;
            for(int i=0; i<N; i++) {
                if(idx == i) continue;
                if(eggs[i].durability > 0) {
                    check = true;
                    eggs[idx].fight(eggs[i]);
                    dfs(idx + 1);
                    eggs[idx].restore(eggs[i]);
                }
            }
            if(!check) dfs(idx + 1);
        } else {
            dfs(idx + 1);
        }
    }
}

class Egg {
    int durability;
    int weight;

    public Egg(int d, int w) {
        this.durability = d;
        this.weight = w;
    }

    public void fight(Egg other) {
        this.durability -= other.weight;
        other.durability -= this.weight;
    }

    public void restore(Egg other) {
        this.durability += other.weight;
        other.durability += this.weight;
    }
}