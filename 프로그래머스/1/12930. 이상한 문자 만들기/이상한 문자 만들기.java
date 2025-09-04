class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            
            if (alphabet == ' ') {
                answer.append(' ');
                index = 0;
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(alphabet));
                } else {
                    answer.append(Character.toLowerCase(alphabet));
                }
                index++;
            }
        }
        return answer.toString();
    }
}