class Solution {
    int answer = -1;
    public int solution(int k, int[][] dungeons) {

        
        for(int i=0; i<dungeons.length; i++){
            if(dungeons[i][0] <= k){
                dfs(i, k, 0, new boolean[dungeons.length], dungeons);
            }
        }
        
        
        return answer;
    }
    
    private void dfs(int start, int k, int cnt, boolean[] visited, int[][] dungeons){
        visited[start] = true;
        if(k - dungeons[start][1] >= 0){
            k -= dungeons[start][1];
            cnt += 1;
        }
        answer = Math.max(cnt, answer);
        for(int i=0; i<dungeons.length; i++){
            if(dungeons[i][0] <= k && !visited[i]){
                dfs(i, k, cnt, visited, dungeons);
                visited[i] = false;
            }
        }
    }
}