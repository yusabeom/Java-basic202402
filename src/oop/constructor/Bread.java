package oop.constructor;

public class Bread {

    String name;
    int price;
    String ingredient;

    // 매개값을 아무것도 받지 않는 기본 생성자는 클래스 내에 존재하는 편이 좋다.
    // 매개값을 받는 여러 생성자를 이용할 수도 있지만, 기본 형태로 생성되어야 할 일도 있기 때문

    Bread(){}
    
    Bread (String bName,int bPrice, String bIngredient){
        name = bName;
        price = bPrice;
        ingredient = bIngredient;
    }

    void breadInfo() {
        System.out.println("빵의 이름: " + name);
        System.out.println("빵의 가격: " + price + "원");
        System.out.println("빵의 주재료: " + ingredient +"입니다.");
    }

}
