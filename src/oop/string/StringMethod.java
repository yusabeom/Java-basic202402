package oop.string;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Hello Java";

        // charAt(index): 문자열 인덱스에 따른 단일 문자를 반환.
        char c = str.charAt(4);
        System.out.println("4번 인덱스 = " + c);

        // subString(begin, end): 문자열을 범위를 지정해서 부분 추출.
        String ss1 = str.substring(1, 5);
        System.out.println("ss1 = " + ss1);
        
        String ss2 = str.substring(6); //6번부터 끝까지 추출.
        System.out.println("ss2 = " + ss2);
        
        // length(): 문자열의 총 길이 반환.
        int length = str.length();
        System.out.println("length = " + length);

        // indexOf(str): 해당 문자가 있는 인덱스를 반환
        // 해당 문자가 존재하지 않는다면 -1을 리턴
        int idx1 = str.indexOf("l");
        System.out.println("idx1 = " + idx1); //먼저 발견된 것을 리턴

        int idx2 = str.lastIndexOf("l");
        System.out.println("idx2 = " + idx2);

        // 여러 문자를 전달하면 시작 인덱스를 알려줍니다.
        int idx3 = str.indexOf("Java"); //대소문자 구별
        System.out.println("Java의 시작인덱스 = " + idx3);

        String str2 = "HeLLo WoRLd";
        String lower = str2.toLowerCase();
        System.out.println("lower = " + lower);
        String upper = str2.toUpperCase();
        System.out.println("upper = " + upper);

        // trim(): 문자열의 앞, 뒤 공백을 제거.
        String name = "                  홍길동                      ";
        System.out.println(name + "님 안녕하세요~!");
        String trim = name.trim();
        System.out.println("trim = " + trim);

        //replace(old, new): 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경
        String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
        String replace = java.replace("자바", "java");
        System.out.println("replace = " + replace);
        System.out.println(replace.replace("습니",""));

        // split(구분자): 문자열을 구분자로 구분하여 분할.
        // 분할된 문자들은 String 배열에 담겨서 리턴.
        String phone = "010-1234-5678";
        String[] numbers = phone.split("-");
        System.out.println(Arrays.toString(numbers));

        String pet = "멍멍이, 야옹이, 짹짹이";
        String[] petSplit = pet.split(", ");
        System.out.println(Arrays.toString(petSplit));

        System.out.println("----------------------------------");

        // 문자열의 정수/실수 변환
        String s1 = "100";
        String s2 = "3.14";
        System.out.println(s1 + s2);

        // 순수한 정수 or 실수로 이루어져 있어야 변환이 가능합니다.
        int i = Integer.parseInt(s1); // 문자열 -> 정수
        double d = Double.parseDouble(s2); // 문자열 -> 실수
        System.out.println(i + d);

        // valueOf: 기본타입을 문자열로 변경
        System.out.println(String.valueOf(i)+ String.valueOf(d));


    }
}
