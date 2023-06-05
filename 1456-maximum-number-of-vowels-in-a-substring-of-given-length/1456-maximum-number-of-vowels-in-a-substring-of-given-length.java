class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        char[] chars = s.toCharArray();

        for(int i=0; i<k; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                count++;
            }
        }

        int max = count;

        for(int i=k; i<s.length(); i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                count++;
            }
            if(chars[i-k] == 'a' || chars[i-k] == 'e' || chars[i-k] == 'i' || chars[i-k] == 'o' || chars[i-k] == 'u'){
                count--;
            }
            max = Math.max(count, max);
        }

        return max;
    }
}