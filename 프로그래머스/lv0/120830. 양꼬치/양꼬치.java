class Solution {
    public int solution(int n, int k) {
        int count = n/10;
        return (n*12000) + ((k-count)*2000);
    }
}