package oop.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 88;
//        my.month = 2342341;
//        my.day = 2;
        my.setYear(1997);
        my.setMonth(11);
        my.setDay(30);
//        System.out.printf("내 생일은 %d년 %d월 %d일 입니다\n",
//                my.getYear("aaa1111!"), my.getMonth(), my.getDay());
        my.birthInfo();
    }
}
