package oop.this_super;

public class MainClass {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.name = "플레이어1";
        p1.characterInfo();

        System.out.println("------------------------------");

        Player p2 = new Player("플레이어2");
        System.out.println("main에서 p2 주소값: "+ p2);
        p2.characterInfo();

    }
}
