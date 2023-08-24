import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] num1= {{1,2},{3,4}};

        String []arr= {"sun", "bed", "car"};
        sol.solution(arr,4);

    }
}


class Solution {
    public String[] solution(String[] strings, int n) {
        // sol ArrayList를 이용해서 sort
        ArrayList<String> arr = new ArrayList<>(List.of(strings));

        for(int i =0;i< strings.length;i++)
            System.out.println(strings[i]);
        arr.sort((st1,st2)->st1.charAt(n)-st2.charAt(n));

        for(int i =0;i< strings.length;i++)
            System.out.println(strings[i]);
            return answer;
    }
}




import java.util.*;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arrInt = new ArrayList<>();

        StringBuilder strReverse = new StringBuilder(String.valueOf(n));
        strReverse = strReverse.reverse();
        for (int i = 0; i < strReverse.length(); i++)
            arrInt.add(Integer.parseInt(String.valueOf(strReverse.charAt(i))));

        return arrInt.stream().mapToInt(i->i).toArray();


    }
}











import java.util.*;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arrInt = new ArrayList<>(); //Array list 형 자료구조 개체 만듬
        //숫자n을 문자열로 변경
        StringBuilder strReverse = new StringBuilder(String.valueOf(n)); //reverse 사용하기 위해 StringBuilder 클래스 생성
        strReverse = strReverse.reverse();//문자열n을 뒤집기
        for (int i = 0; i < strReverse.length(); i++)
            arrInt.add(Integer.parseInt(String.valueOf(strReverse.charAt(i)))); //charAT 문자열 안에 몇번째 문자인지를 char 형으로 가지고옴 add 가 저장 문자열n 뒤집기까지

        return arrInt.stream().mapToInt(i->i).toArray(); // mapToInt = Interger 를 int로 바꿔서 toArray 배열을 만들어줌


    }
}


