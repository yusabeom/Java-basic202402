package oop.final_.field;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수");
        // kim.name = "김마이클"; (x)
//        kim.nation = "미국"; (x)
        kim.age = 27;

        Person park = new Person("박영희");
//        park.nation = "영국"; (x)
//        park.name = "박호두"; (x)
        park.age = 20;

    }
}
