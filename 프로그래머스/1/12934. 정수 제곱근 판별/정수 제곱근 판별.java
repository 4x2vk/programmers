class Solution {
    public long solution(long n) {
        long answer = 0;
        double root = Math.sqrt(n);
            if(root % 1 == 0){
                long next = (long) root + 1;
                answer = next * next;                
            } else {
                answer = -1;
            }
        return answer;
    }
}