import java.util.*;
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);

        int sum = 0;

        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];
        }

        return sum / (double)(salary.length-2);
    }
}