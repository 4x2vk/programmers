class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int mid = length / 2;
        
        if (length % 2 == 0) {
            String middleTwo = s.substring(mid - 1, mid + 1);
            answer = middleTwo;
        }
        
        if (length % 2 == 1) {
            int middleOne = (length + 1) / 2;
            String middleStr = String.valueOf(s.charAt(middleOne - 1));
            answer = middleStr;
        }
        return answer;
    }
}