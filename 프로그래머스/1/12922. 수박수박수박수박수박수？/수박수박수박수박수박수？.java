class Solution {
    public String solution(int n) {
        String answer = "";
        String firstWord = "수";
        String secondWord = "박";
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                answer += firstWord;
            } else {
                answer += secondWord;
            }
        }
        return answer;
    }
}