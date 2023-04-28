import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length-5];
        int idex = 0;
        Arrays.sort(num_list);
        for(int i = 5; i < num_list.length; i++){
            answer[idex] = num_list[i];
            idex++;
        }
        return answer;
    }
}