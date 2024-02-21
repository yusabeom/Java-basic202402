package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int point = sc.nextInt();

        // switch 의 기준값은 정수 혹은 문자열만 가능합니다.
        // 연산의 결과값도 기준값으로 사용이 가능합니다.
        switch (point / 10) {
            case 10: case 9:
                if(point>100){
                    System.out.println("잘못된 점수입니다.");
                    break;
                }
                System.out.println(point+"점 학점 A드릴게요~!");
                break;
            case 8:
                System.out.println(point+"점 학점 B드릴게요~!");
                break;
            case 7:
                System.out.println(point+"점 학점 C드릴게요~!");
                break;
            case 6:
                System.out.println(point+"점 학점 D드릴게요~!");
                break;

            default:
                if (point > 100 || point <0){
                    System.out.println("점수를 잘못 입력하셨습니다.");
                    break;
                }
                System.out.println(point+"점은 낙제입니다 F학점");
        } sc.close();
    }
}
