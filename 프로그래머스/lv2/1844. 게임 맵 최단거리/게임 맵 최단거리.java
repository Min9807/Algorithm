import java.util.*;

class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));
        maps[0][0] = 0;
        int maxX = maps[0].length - 1;
        int maxY = maps.length - 1;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == maxX && node.y == maxY){
                return node.sum;
            }
            for(int i=0; i<4; i++){
                int kx = node.x + dx[i];
                int ky = node.y + dy[i];
                if(kx >= 0 && kx <= maxX && ky >= 0 && ky <= maxY){
                    if(maps[ky][kx] == 1){
                        q.offer(new Node(kx, ky, node.sum+1));
                        maps[ky][kx] = 0;
                    }
                }
            }
        }
        
        return -1;
    }
    
    private class Node{
        public int x;
        public int y;
        public int sum;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
            this.sum = 1;
        }
        
        public Node(int x, int y, int sum){
            this.x = x;
            this.y = y;
            this.sum += sum;
        }
        
    }
}