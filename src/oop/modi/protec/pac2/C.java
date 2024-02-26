package oop.modi.protec.pac2;

import oop.modi.protec.pac1.*;

public class C extends A{
//    A a1 = new A(30);
//    A a2 = new A()(5.67);

     public C() {

         // protected 제한자는 패키지가 다른경우 두 클래스 사이에 상속 관계가 존재한다면
         // super 키워드를 통해 참조를 허용합니다.

        super(30);
//        super(3.14); default는 패키지가 달라지면 접근을 막기때문에 super키워드 적용 x

         super.x = 1;
//         super.y = 2; default

         super.method1();
//         super.method2();

    }



}
