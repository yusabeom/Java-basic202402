package basic.constate;

import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {

/*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        Scanner user = new Scanner(System.in);
        System.out.println("정수를 입력해주세요.");
        int n1 = user.nextInt();
        System.out.println("두번째 정수를 입력해주세요");
        int n2 = user.nextInt();
        System.out.println("마지막 정수를 입력해주세요");
        int n3 = user.nextInt();
        int max, mid, min;
        if (n1 > n2 && n1 > n3){
            max = n1;
            mid = (n2 > n3) ? n2 : n3;
            min = (n2 > n3) ? n3 : n2;
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
            mid = (n1 > n3) ? n1 : n3;
            min = (n1 > n3) ? n3 : n1;
        } else {
            max = n3;
            mid = (n1 > n2) ? n1 : n2;
            min = (n1 > n2) ? n2 : n1;
        }
        System.out.println("max: "+ max+"\nmid: "+ mid + "\nmin: "+ min);
        user.close();
    }
}
