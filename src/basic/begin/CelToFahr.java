package basic.begin;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {

        /*
         사용자에게 섭씨온도를 입력받아서
         화씨온도로 변환하여 출력하는 로직을 작성하세요.
         변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
         화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
         # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨를 입력하세요: ");
        double sub = sc.nextDouble();
        double ff = (9.0/5) * sub +32;

        System.out.printf("%.1f℃ = %.1f℉ 입니다.", sub, ff);

        sc.close();

    }
}
