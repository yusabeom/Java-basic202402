package oop.poly.player;

public class Warrior extends Player {

    int rage;

    Warrior(String name) {
        super(name);
        this.rage = 60;
    }
    public void rush(Player p){
        /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */
        System.out.println(this.name+"님이 "+p.name+"님에게 돌진을 시전했습니다!");
        int damage; String job;
        if (p instanceof Warrior){
            p.hp -= 10;
            System.out.printf("%s님(전사)이 10의 피해를 입었습니다.\n",p.name);
            System.out.printf("%s님의 남은 체력: %d\n",p.name,p.hp);
            System.out.println("-------------------------------");
        } else if (p instanceof Mage) {
            p.hp -= 20;
            System.out.printf("%s님(마법사)이 20의 피해를 입었습니다.\n",p.name);
            System.out.printf("%s님의 남은 체력: %d\n",p.name,p.hp);
            System.out.println("-------------------------------");
        } else {
            p.hp -= 15;
            System.out.printf("%s님(사냥꾼)이 15의 피해를 입었습니다.\n",p.name);
            System.out.printf("%s님의 남은 체력: %d\n",p.name,p.hp);
            System.out.println("-------------------------------");
        }

    }


    void characterInfo() {

        super.characterInfo();

        System.out.println("# 분노: " + rage);
    }
}
