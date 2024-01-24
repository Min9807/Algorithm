import java.util.*;
class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    int cnt = 0;
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    public int solution(int[][] land) {
        int[] row = new int[land[0].length];
        for(int i=0; i<land.length; i++) {
            for(int j=0; j<land[0].length; j++) {
                if(land[i][j] == 1) {

                    dfs(j, i, land);
                    for(int k=minX; k<=maxX; k++) {
                        row[k] += cnt;
                    }
                    cnt = 0;
                    minX = Integer.MAX_VALUE;
                    maxX = Integer.MIN_VALUE;
                }
            }
        }
        Arrays.sort(row);
        return row[row.length - 1];
    }
    
    private void dfs(int x, int y, int[][] land) {
        cnt++;
        land[y][x] = 0;
        minX = Math.min(x, minX);
        maxX = Math.max(x, maxX);
        for(int i=0; i<4; i++) {
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < land[0].length && ky >= 0 && ky < land.length) {
                if(land[ky][kx] == 1) {
                    land[ky][kx] = 0;
                    dfs(kx, ky, land);
                }
            }
        }
    }
}