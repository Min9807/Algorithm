import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        while(N-- > 0){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }
        Book[] books = new Book[map.size()];
        int idx = 0;
        for(String key : map.keySet()){
            books[idx++] = new Book(key, map.get(key));
        }

        Arrays.sort(books, (t1, t2) -> {
            if(t1.cnt == t2.cnt){
                return t1.name.compareTo(t2.name);
            }
            return t2.cnt - t1.cnt;
        });

        System.out.print(books[0].name);
    }

    private static class Book{

        public String name;
        public int cnt;

        public Book(String name, int cnt){
            this.name = name;
            this.cnt = cnt;
        }
    }
}