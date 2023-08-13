import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            students[i] = new Student(age, name, i);
        }
        Arrays.sort(students);
        for(Student student : students){
            System.out.println(student.age + " " + student.name);
        }
    }

    private static class Student implements Comparable<Student>{
        public int age;
        public String name;
        public int order;
        public Student(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public int compareTo(Student o){
            if(age == o.age){
                return order - o.order;
            }
            return age - o.age;
        }
    }
}