import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] studentA = {1,2,3,4,5};
        int[] studentB = {2,1,2,3,2,4,2,5};
        int[] studentC = {3,3,1,1,2,2,4,4,5,5};
        
        int studentACount = calcu(studentA, answers);
        int studentBCount = calcu(studentB, answers);
        int studentCCount = calcu(studentC, answers);

        answer.add(1);
        int max = studentACount;

        if(studentBCount > max){
            answer.clear();
            max = studentBCount;
            answer.add(2);
        }
        else if(studentBCount == max){
            answer.add(2);
        }
        
        if(studentCCount > max){
            answer.clear();
            answer.add(3);
        }
        else if(studentCCount == max){
            answer.add(3);
        }
        
        int[] result = new int[answer.size()];
        for(int i=0; i<result.length; i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
    public int calcu(int[] student, int[] answers){
        int count = 0;
        int n = 0;
        for(int answer : answers){
            if(count == student.length){
                count = 0;
            }
            if(answer == student[count]){
                n++;
            }
            count++;
        }
        return n;
    }
}