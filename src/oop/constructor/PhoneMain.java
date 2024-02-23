package oop.constructor;

public class PhoneMain {
    public static void main(String[] args) {

        Phone basic = new Phone();
//        basic.model = "연아의 햅틱";
//        basic.color = "Pink";
//        basic.price = 500000;
        basic.showSpec();

        Phone basic2 = new Phone();
        basic.showSpec();

        System.out.println("------------------------------------");

        Phone galaxy = new Phone("갤럭시 s24");
        galaxy.showSpec();

        System.out.println("------------------------------------");

        Phone iPhone = new Phone("아이폰 15","violet");
        iPhone.showSpec();

    }
}
