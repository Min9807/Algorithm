class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0 ,0);
        return answer;
    }
    private void dfs(int[] numbers, int target, int dep, int sum) {
        if(dep == numbers.length) {
            if(target == sum) answer++;
        } else {
            dfs(numbers, target, dep + 1, sum + numbers[dep]);
            dfs(numbers, target, dep + 1, sum - numbers[dep]);
        }
    }
}