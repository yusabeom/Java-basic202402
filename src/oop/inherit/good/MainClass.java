package oop.inherit.good;

public class MainClass {
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.name = "타락파워전사";
        w1.level = 280;
        w1.atk = 999;
        w1.hp = 50000;
        w1.rage = 100;
        w1.characterInfo();

        Mage m1 = new Mage();
        m1.name = "지존법사";
        m1.level = 99;
        m1.atk = 4;
        m1.hp = 300;
        m1.mana = 50000;
        m1.characterInfo();

        Hunter h1 = new Hunter();
        h1.name = "헌터H";
        h1.level = 200;
        h1.atk = 567;
        h1.hp = 30000;
        h1.pet = "드래곤 헤츨링";
        h1.characterInfo();

    }
}
