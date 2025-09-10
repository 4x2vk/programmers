class Solution {
    public int solution(String t, String p) {
        int m = p.length();
        long target = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - m; i++) {
            String sub = t.substring(i, i + m);
            if (Long.parseLong(sub) <= target) {
                answer++;
            }
        }
        return answer;
    }
}
