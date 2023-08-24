import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Main{
    public static void main(String[] args) {
        String [] str = {"sum","bed","car"};
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution solution = new Solution();
        solution.solution(array,commands);


    }
}
//class Solution {  // Sub string 이용
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        String result="";
//        for (int i = 0; i < array.length; i++)
//            result+=array[i];
//        //sol sub string하고 for문 쓰면 될 듯
//        for (int i = 0; i < commands.length; i++) {
//            String temp =(result.substring(commands[i][0]-1, commands[i][1]));
//            char [] tempChar = temp.toCharArray();
//            Arrays.sort(tempChar);
//            temp =String.valueOf(tempChar);
//            answer[i]=Integer.parseInt(temp.substring(commands[i][2]-1,commands[i][2]));
//        }
//        return answer;
//    }
//}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int [] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i]=temp[commands[i][2]-1];
//            for (int j = 0; j < temp.length; j++) {
//                System.out.print(temp[j]);
//            }
//            System.out.println();
        }
        return answer;
    }
}