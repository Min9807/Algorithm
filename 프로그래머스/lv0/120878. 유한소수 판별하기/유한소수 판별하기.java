import java.util.*;
class Solution {
    public int solution(int a, int b) {
        
        for(int i=b; i>1; i--){
            if(a%i==0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        
        while(b%2==0){
            b/=2;
        }
        while(b%5==0){
            b/=5;
        }
        
        if(b==1){
            return 1;
        }
        return 2;
    }
}