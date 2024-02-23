package oop.string;

import java.util.Scanner;

public class StringQuiz {
    public static void main(String[] args) {

        /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. 921013-1234567 입력한다면
         1992년 10월 13일 32세 남자
         2000년 이후 출생자는 3,4로 구분
         031125-3456789 -> 2003년 11월 25일 21세 남자
         */
        Scanner sc = new Scanner(System.in);
        String gen = "여자";

        while (true) {
            System.out.println("주민등록번호를 입력하세요: ");
            String userInput = sc.next();

            if(userInput.indexOf("-") == -1){
                System.out.println("-을 포함해서 입력하세요");
                continue;
            } else if (userInput.length() != 14){
                System.out.println("주민등록번호는 13자리 입니다.");
                continue;
            }

            String[] userPv = userInput.split("-");
            String userYear = userPv[0].substring(0,1);
            String userGender = userPv[1].substring(0,1);
            String age = userPv[0].substring(0, 2);
            String month = userPv[0].substring(2, 4);
            String day = userPv[0].substring(4, 6);

            if (userGender.equals("1") || userGender.equals("3")){
                if(userYear.equals("0")){
                    System.out.println("20"+ age+ "년"+month+"월"+day+"일"+(24-Integer.parseInt(age))+"살 남자 입니다.");
                    break;
                }else {
                    System.out.println("19"+ age+ "년"+month+"월"+day+"일"+(124-Integer.parseInt(age))+"살 남자 입니다.");
                    break;
                }

            } else {
                if(userYear.equals("0")){
                    System.out.println("20"+ age+ "년"+month+"월"+day+"일"+(24-Integer.parseInt(age))+"살 여자 입니다.");
                    break;
                }else {
                    System.out.println("19"+ age+ "년"+month+"월"+day+"일"+(124-Integer.parseInt(age))+"살 여자 입니다.");
                    break;
                }
            }

        }


    }
}
