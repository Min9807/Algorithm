import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0; i<my_string.length(); i++){
            if(my_string.substring(i,i+1).matches("[0-9]")){
                al.add(Integer.parseInt(my_string.substring(i,i+1)));
            }
        }
        al.sort(Comparator.naturalOrder());
        return al;
    }
}