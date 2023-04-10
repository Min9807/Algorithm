class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Num = 0;
        int cards2Num = 0;
        for(int k=0; k<goal.length; k++){
            if(cards1[cards1Num].equals(goal[k])){
                if(cards1Num<cards1.length-1) cards1Num++;
            }
            else if(cards2[cards2Num].equals(goal[k])){
                if(cards2Num<cards2.length-1) cards2Num++;
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}