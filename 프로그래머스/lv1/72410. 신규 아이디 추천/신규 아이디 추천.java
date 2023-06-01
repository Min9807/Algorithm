class Solution {
    private static StringBuilder sb = new StringBuilder();
    
    
    public String solution(String new_id) {
        // 1. 대문자를 소문자로 치환
        toLower(new_id);
        // 2. 소문자, 숫자, -, _, 마침표를 제외한 모든 문자 제거
        sb = new StringBuilder(sb.toString().replaceAll("[^a-z0-9_.-]", ""));
        // 3. 마침표가 2개면 1개로 치환
        replaceStr();
        // 4. 마침표가 처음과 끝에 있으면 제거
        toRemove();
        // 5. 공백은 a로 치환
        if(sb.length() == 0){
            sb.append("aaa");
        }
        // 6. 길이가 16자 이상이면 앞에 15개만 뽑는다.
        if(sb.length() > 15){
            sb = new StringBuilder(sb.substring(0,15));
        }
        // 7. 길이가 2자 이하면 마지막 문자를 3이 될때까지 반복해서 끝에 붙인다.
        while(sb.length() < 3){
            sb.append(sb.charAt(sb.length()-1));
        }
        toRemove();
        return sb.toString();
    }
    
    // 1. 대문자를 소문자로 치환
    private void toLower(String new_id){
        for(char c : new_id.toCharArray()){
            if(c >= 65 && c<= 90){
                sb.append(Character.toLowerCase(c));
                continue;
            }
            sb.append(c);
            
        }
    }
    
    // 3. 마침표가 2개면 1개로 치환
    public void replaceStr(){
        char[] chars = sb.toString().toCharArray();
        sb.setLength(0);
        int count = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] == '.'){
                count++;
            }else if(chars[i] != '.' && count >= 1){
                sb.append('.');
                sb.append(chars[i]);
                count = 0;
            }else{
                sb.append(chars[i]);
            }
        }
    }
    
    // 4. 마침표가 처음과 끝에 있으면 제거
    private void toRemove(){
        if(sb.length() == 0) return;
        else if(sb.length() == 1 && sb.toString().equals(".")){
            sb = new StringBuilder(sb.substring(1));
        }else if(sb.length() >= 1 && sb.charAt(0) == '.'){
            sb = new StringBuilder(sb.substring(1));
        }else if(sb.length() >= 1 && sb.charAt(sb.length()-1) == '.'){
            sb = new StringBuilder(sb.deleteCharAt(sb.length()-1));
        }
    }
    

}