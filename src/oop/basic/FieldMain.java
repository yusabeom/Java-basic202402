package oop.basic;

public class FieldMain {
    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();
        fl.a = 2; //초기화 하지 않으면 기본값 0이 도출됨.
        fl.printNumber(4);
        fl.foo();

    }
}
