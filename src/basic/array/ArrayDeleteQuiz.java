package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */

        while (kakao.length != 0){
            boolean flag = false;
            int idx = -1;
            System.out.println("현재 친구 목록: "+ Arrays.toString(kakao));
            System.out.print("삭제할 친구를 입력하세요: ");
            String delName = sc.next();
            for (int i = 0; i < kakao.length; i++) {
                if(delName.equals(kakao[i])){
                    flag = true;
                    idx = i;
                    break;
                }
            }
            if(!flag){
                System.out.println("이름을 정확하게 입력하세요.");
                continue;
            }
            for (int j = idx; j < kakao.length-1; j++) {
                kakao[j] = kakao[j+1];
            }
            String[] temp = new String[kakao.length-1];

            for (int k = 0; k < temp.length; k++) {
                temp[k] = kakao[k];
            }
            kakao = temp;
            temp = null;
        }
        System.out.println("친구가 전부 삭제되었습니다.");
    }
}
