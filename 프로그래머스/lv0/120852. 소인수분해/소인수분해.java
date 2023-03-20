import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        int number = n;
        while(true){
            for(int i=2; i<=number; i++){
                if(n%i==0){
                    n /=i;
                    arrayList.add(i);
                    break;
                }
            }
            if(n==1){
                break;
            }
        }
        for(int item : arrayList){
            if(!answer.contains(item))
                answer.add(item);
        }
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}