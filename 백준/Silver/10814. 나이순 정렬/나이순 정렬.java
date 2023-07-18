import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] members = new Member[N];
        int idx = 0;

        while(N-- > 0){
            int age = sc.nextInt();
            String name = sc.next();
            members[idx++] = new Member(name, age, idx);
        }

        Arrays.sort(members, (t1, t2) -> {
            if(t1.age == t2.age){
                return t1.id - t2.id;
            }
            return t1.age - t2.age;
        });

        for(Member member : members){
            System.out.println(member.age + " " + member.name);
        }
    }

    private static class Member{
        public int id;
        public String name;
        public int age;

        public Member(String name, int age, int id){
            this.name = name;
            this.age = age;
            this.id = id;
        }
    }
}