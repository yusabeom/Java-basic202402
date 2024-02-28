package oop.static_.method;

public class Count {

    public int a; // 인스턴스 변수
    public static int b; // 정적 변수

    // 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
    // 인스턴스 메서드 안에서는 정적변수와 인스턴스 변수를
    // 모두 사용할 수 있습니다.
    public int method1(){

        return this.a + Count.b;
    }

    /*
    - static 블록(메서드, 정적 초기화자) 내부에서는
    static 이 붙은 변수나 메서드만 사용할 수 있습니다.
    - this 는 사용할 수 없습니다. -> 나타낼 주소값이 없기 때문
    -> 객체 생성 없이도 호출이 가능하기 때문.

    - static 블록 내부에서 non-static 멤버를 참조하려면
    반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.
     */
    public static int method2(){
        Count ccc = new Count();
        return ccc.a + Count.b;
    }

}
