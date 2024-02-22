package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        while (true) {

            System.out.println("수정할 친구의 이름을 입력하세요: ");
            String targetName = sc.next();
            // 인덱스 탐색
            int index = -1;
            for (int i = 0; i < kakao.length; i++) {
                if (targetName.equals(kakao[i])) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.printf("%s의 이름을 변경합니다.\n", targetName);
                System.out.print(">> ");
                String newName = sc.next();
                kakao[index] = newName;
                System.out.println("변경 완료!");
                System.out.println("변경 후 정보: "+Arrays.toString(kakao));
                break;

            } else {
                System.out.printf("%s 은(는) 없는 이름입니다.\n", targetName);
            }
        }   sc.close();


//        outer:
//        while (true) {
//            boolean flag = false;
//            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
//            System.out.print("수정 타겟의 이름을 입력하세요: ");
//            String mod = sc.next();
//            for (int i = 0; i < kakao.length; i++) {
//                if (mod.equals(kakao[i])) {
//                    System.out.println("해당 타겟 인덱스: " + i);
//                    System.out.print("새로운 이름을 입력하세요: ");
//                    String newName = sc.next();
//                    kakao[i] = newName;
//                    flag = true;
//                    break;
//                } else if (mod.equals("그만")) {
//                    System.out.println("수정을 종료합니다");
//                    System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
//                    break outer;
//                }
//            }
//            if (!flag) {
//                System.out.println("잘못된 타겟입니다.");
//                continue;
//            }
//
//        }


    }
}
