package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
         연산할 수 없는 입력값이라고 얘기해주세요.
        */
        System.out.println("정수를 입력하세요");
        int n1 = sc.nextInt();
        System.out.println("연산자를 입력하세요 (+,-,*,/)");
        String cal = sc.next();
        System.out.println("마지막 정수를 입력하세요");
        int n2 = sc.nextInt();
        double result = 0;
        switch (cal){
            case "+":
            result = n1 + n2;
            System.out.println(result);
            break;

            case "-":
            result = n1 - n2;
            System.out.println(result);
            break;

            case "*":
            result = n1 * n2;
            System.out.println(result);
            break;

            case "/":
            if(n2 == 0){
                System.out.println("0으로는 나눌수 없습니다.");
                break;
            }
            result = n1 / n2;
            System.out.println(result);
            break;

            default:
                System.out.println("연산기호를 정확학 입력하세요.");
        }
    }
}
