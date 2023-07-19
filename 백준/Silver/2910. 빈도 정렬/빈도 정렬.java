import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        List<Number> list = new ArrayList<>();
        int order = 1;
        while(N-- > 0){
            long num = sc.nextLong();
            boolean check = true;
            for(Number number : list){
                if(number.num == num){
                    number.increaseCnt();
                    check =false;
                    break;
                }
            }
            if(check){
                list.add(new Number(num, order++, 1));
            }
        }

        Collections.sort(list, (t1, t2) ->{
            if(t1.cnt == t2.cnt){
                return t1.order - t2.order;
            }
            return t2.cnt - t1.cnt;
        });

        for(Number n : list){
            long value = n.num;
            int cnt = n.cnt;
            while(cnt-- > 0){
                System.out.print(value + " ");
            }
        }


    }
    private static class Number{
        public long num;
        public int order;
        public int cnt;

        public Number(long num, int order, int cnt){
            this.num = num;
            this.order = order;
            this.cnt = cnt;
        }

        public void increaseCnt(){
            this.cnt += 1;
        }
    }
}