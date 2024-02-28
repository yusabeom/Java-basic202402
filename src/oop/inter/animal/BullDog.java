package oop.inter.animal;

public class BullDog extends Livings implements Violent, Huntable{


    @Override
    public void feed(String foodName) {
        System.out.println("불독이 "+ foodName + "을 먹어요.");
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void angry() {
        System.out.println("화가 적당히 났습니다.");
    }

    @Override
    public void fight() {
        System.out.println("싸움을 썩 잘하진 않습니다.");
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println("불독은 사냥이 가능합니다.");
    }
}
