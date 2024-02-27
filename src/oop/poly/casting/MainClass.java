package oop.poly.casting;

public class MainClass {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.n1 = 1;
//        p.n2 = 2; (x)
        p.method1();
        p.method2();
//        p.method3(); (x)

        System.out.println("-------------------------------");

        Child c = new Child();
        c.n1 = 1; // 부모에게 물려받은 속성
        c.n2 = 2;

        c.method1();
        c.method2();
        c.method3();
        System.out.println("-------------------------------");

        // 다형성 적용(promotion)
        Parent p2 = new Child();
        Child c2 = (Child) p2; // 부모 타입을 자식 타입으로 강제 변환(DownCasting)
        p2.n1 = 1;
//        p2.n2 = 2; (x)
        p2.method1();
        p2.method2();
        System.out.println("p2 = " + p2);
        System.out.println("c2 = " + c2); //객체가 2개생성된게 아닌 하나의 객체의 접근방식을 두가지로 늘린겁니다.
//        p2.method3(); (x)
        /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */

        // object 타입의 변수는 어떠한 객체든 담을 수 있지만, 객체 고유의 기능을 사용하기 위해서는
        // 형 변환이 거의 항상 필요합니다 -> object가 물려주는 메서드 자체가 별로 없음.
        Object obj = new String("안녕하세요~!");
        String str = (String) obj;
        System.out.println("문자열의 길이: "+ str.length());

        // 다형성이 한 번도 발생하지 않은 경우에는
        // 강제 형 변환을 사용할 수 없습니다.
        Parent ppp = new Parent();
        Child ccc = (Child) ppp;

    }
}
