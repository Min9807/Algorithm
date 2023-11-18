import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Student[] students = new Student[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, korean, english, math);
        }
        Arrays.sort(students, (v1, v2) -> {
            if(v1.korean != v2.korean) {
                return v2.korean - v1.korean;
            }
            else if(v1.english != v2.english) {
                return v1.english - v2.english;
            }
            else if(v1.math != v2.math) {
                return v2.math - v1.math;
            }
            return v1.name.compareTo(v2.name);
        });

        for(int i=0; i<N; i++) {
            System.out.println(students[i].name);
        }
    }
    private static class Student {
        public String name;
        public int korean;
        public int english;
        public int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}