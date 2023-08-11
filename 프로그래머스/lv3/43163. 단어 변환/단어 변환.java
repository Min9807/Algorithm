import java.util.*;
class Solution {
    int answer = 0;
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(begin, 0));
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.word.equals(target)){
                return node.cnt;
            }
            for(String word : words){
                boolean check = calcu(node.word, word);

                if(check){
                    q.offer(new Node(word, node.cnt + 1));
                }
            }
        }
        
        return 0;
    }
    
    private boolean calcu(String str1, String str2){
        int count = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
    
    private class Node{
        public String word;
        public int cnt;
        
        public Node(String word, int cnt){
            this.word = word;
            this.cnt = cnt;
        }
    }
}