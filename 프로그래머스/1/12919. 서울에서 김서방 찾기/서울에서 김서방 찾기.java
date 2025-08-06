import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        String target = "Kim";
        
        int index = IntStream.range(0, seoul.length)
                             .filter(e -> seoul[e].equals(target))
                             .findFirst()
                             .orElse(-1);
        
        String answer = "김서방은 " + index + "에 있다";
        System.out.println(answer);
        
        return answer;
    }
}