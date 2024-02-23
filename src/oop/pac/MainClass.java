// 패키지 선언은 항상 클래스 최 상단에 위치해야 합니다.
package oop.pac;

// 작성중인 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면 import가 필요합니다.
//import oop.pac.fruit.Apple;
//import oop.pac.fruit.Banana;
//import oop.pac.fruit.Melon;
import oop.pac.fruit.*; //전부 선택
//import oop.pac.juice.*; 어느패키지의 Apple 인지 구분이 안됨

public class MainClass {
    public static void main(String[] args) {

        Apple a = new Apple();
        oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();
        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 명시해 주셔야 합니다.

        Banana b = new Banana();
        Melon m = new Melon();

//  java.util.Scanner sc = new java.util.Scanner(System.in); //절대 추천 X !!


    }
}
