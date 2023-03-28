class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){ // 공백일 때
                continue;
            }
            
            else if(str[i].charAt(0)>=65 && str[i].charAt(0)<=90){ // 대문자인 경우
                if((str[i].charAt(0) + n) >90){ // Z를 넘는 경우
                    int num = 64+(str[i].charAt(0) + n)-90;
                    str[i] = String.valueOf((char)num);

                }else{
                    int num = str[i].charAt(0) + n;
                    str[i] = String.valueOf((char)num);
                }
            }
            
            else if(str[i].charAt(0)>=97 && str[i].charAt(0)<=122){ // 소문자인 경우
                if((str[i].charAt(0) + n) >122){ // z를 넘는 경우
                    int num = 96+(str[i].charAt(0) + n)-122;
                    str[i] = String.valueOf((char)(num));

                }else{
                    int num = str[i].charAt(0) + n;
                    str[i] = String.valueOf((char)num);
                }
            }
        }
        
        for(String a : str){
            answer+=a;
        }
        
        return answer;
    }
}