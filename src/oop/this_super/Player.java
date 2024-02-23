package oop.this_super;

public class Player {

    String name;
    int level;
    int atk;
    int hp;


    Player(){
        System.out.println("Player의 기본생성자 호출!");
        level = 1;
        atk = 4;
        hp = 50;
    }
    Player(String name){
        System.out.println("Player의 2번 생성자 호출!");
        System.out.println("생성자에서 this의 주소값: " + this);
        level = 1;
        atk = 4;
        hp = 50;
        this.name =  name; //호출된 주소값을 지정해줌 p2.name과 같은말
    }

    void characterInfo(){
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("# 아이디 = " + name);
        System.out.println("# 레벨 = " + level);
        System.out.println("# 공격력 = " + atk);
        System.out.println("# 체력 = " + hp);
    }

}
