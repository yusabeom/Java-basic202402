package oop.poly.player;

public class Mage extends Player {
    int mana;


    Mage(String name){
        super(name);
        this.mana = 100;
    }

    public void blizzard(Player[] target){
        System.out.println(this.name + "님이 블리자드 스킬 시전");
        this.mana -= 30;
        System.out.println("30마나를 소모합니다. "+" 남은 마나: "+ this.mana);

        for (Player p :target) {
            if(p == this) continue;
            int damage = (int) (Math.random()*6+10);
            p.hp -= damage;
            System.out.println(p.name+"님이 "+damage+"의 피해를 입었습니다.  " + " 남은 체력: "+p.hp);
        }

    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나 = " + mana);
    }



}
