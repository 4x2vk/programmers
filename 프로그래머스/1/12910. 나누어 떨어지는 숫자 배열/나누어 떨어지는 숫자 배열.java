import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }
        
        if (result.isEmpty()){
            return new int[]{-1};
        }
        
        Collections.sort(result);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}