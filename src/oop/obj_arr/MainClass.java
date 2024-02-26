package oop.obj_arr;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

//        Person Kim  = new Person("유사범", 28 , "남자");
//        Person Lee  = new Person("이가연", 29 , "여자");
//        Person Park  = new Person("박뽀삐", 58 , "남자");
//
//        Kim.personInfo();
//        Lee.personInfo();
//        Park.personInfo();

//        Person[] people = new Person[3];
//        people[0] = new Person("유사범", 28 , "남자");
//        people[1] = new Person("이가연", 29 , "남자");
//        people[2] = new Person("박뽀삐", 58 , "남자");

        int[] arr = {1, 3, 5, 7, 9};
        Person [] people = {
                new Person("유사범", 28 , "남자"),
                new Person("이가연", 29 , "여자"),
                new Person("박뽀삐", 58 , "남자")
        };
//        System.out.println(Arrays.toString(people));
//        people[0].personInfo();
//        people[1].personInfo();
//        people[2].personInfo();

//        for (int i = 0; i < people.length; i++) {
//            people[i].personInfo();
//        }

        for (Person p : people) { // iter
            p.personInfo();
        }

    }
}
