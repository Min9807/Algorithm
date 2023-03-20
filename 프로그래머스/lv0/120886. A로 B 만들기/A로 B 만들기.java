class Solution {
    public int solution(String before, String after) {
        String[] args = before.split("");
        String[] str = after.split("");
        String answer = "";
        int count = 0;
        for(int i=0; i<args.length; i++){
            for(int j=0; j<args.length; j++){
                if(args[j].equals(str[i])){
                    args[j] = "";
                    count++;
                    break;
                }
            }
        }        
        if(count==args.length){
            return 1;
        }

        return 0;
    }
}