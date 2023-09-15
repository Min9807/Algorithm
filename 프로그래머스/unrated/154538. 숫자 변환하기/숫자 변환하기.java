import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int[] mem = new int[y - x + 1];
        Arrays.fill(mem, Integer.MAX_VALUE);
        mem[0] = 0;

        for (int i = x; i <= y; i++){
            if(mem[i - x] == Integer.MAX_VALUE){
                continue;
            }if(i + n <= y) {
                mem[i + n - x] = Math.min(mem[i + n - x], mem[i - x] + 1);
            }if(i * 2 <= y) {
                mem[i * 2 - x] = Math.min(mem[i * 2 - x], mem[i - x] + 1);
            }if(i * 3 <= y) {
                mem[i * 3 - x] = Math.min(mem[i * 3 - x], mem[i - x] + 1);
            }
        }

        return mem[y - x] == Integer.MAX_VALUE ? -1 : mem[y - x];
    }
}