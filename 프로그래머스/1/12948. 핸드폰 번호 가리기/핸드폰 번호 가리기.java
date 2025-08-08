class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < length - 4; i++){
            masked.append('*');
        }
        masked.append(phone_number.substring(length - 4));
        return masked.toString();
    }
}