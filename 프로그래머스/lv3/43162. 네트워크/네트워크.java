class Solution {
    boolean[] visited;
    int ans;
    public int solution(int n, int[][] computers) {
        ans = n;
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(n, computers, i);
            }
        }
        return ans;
    }
    
    private void dfs(int n, int[][] computers, int start){
        visited[start] = true;
        for(int i=0; i<n; i++){
            if(start == i) continue;
            if(computers[start][i] == 1 && !visited[i]){
                ans--;
                dfs(n, computers, i);
            }
        }
    }
}