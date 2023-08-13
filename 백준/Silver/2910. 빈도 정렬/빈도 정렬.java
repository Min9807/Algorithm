import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        List<Node> list = new ArrayList<>();
        int order = 1;
        st = new StringTokenizer(br.readLine());
        while(N-- > 0){
            long num = Long.parseLong(st.nextToken());
            boolean check = true;
            for(Node node : list){
                if(node.value == num){
                    node.increase();
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(new Node(num, order++, 1));
            }
        }
        
        Collections.sort(list);
        for(Node n : list){
            long value = n.value;
            int cnt = n.cnt;
            while(cnt-- > 0){
                System.out.print(value + " ");
            }
        }
    }

    private static class Node implements Comparable<Node>{
        public long value;
        public int order;
        public int cnt;
        
        public Node(long value, int order, int cnt){
            this.value = value;
            this.order = order;
            this.cnt = cnt;
        }
        
        public void increase(){
            this.cnt += 1;
        }

        @Override
        public int compareTo(Node n){
            if(n.cnt == cnt){
                return order - n.order;
            }
            return n.cnt - cnt;
        }

        @Override
        public boolean equals(Object o){
            if(o == this) return true;
            if(!(o instanceof Node)) return false;
            Node node = (Node) o;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode(){
            return Objects.hash(value);
        }
    }
}