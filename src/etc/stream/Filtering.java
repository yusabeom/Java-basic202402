package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환.

        // 메뉴 중에 채식주의자가 먹을 수 있는 음식들만 필터링
         menuList.stream() // menuList 정보를 가진 stream객체를 받음
                .filter(dish -> dish.isVegetarian()) // stream객체의 filter 호출(predicate 인터페이스를 구현한 객체)
                .collect(toList()) // 필터링 된 stream 객체를 List로 변환해서 리턴.
                .forEach(dish -> System.out.println(dish)); // 리스트 내부 순회 (void)
            // dishInVegetarian.forEach(dish -> System.out.println("dish: " + dish.getName()));

        System.out.println("========= 육류, 600칼로리 미만 ========");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 요리 중에 요리 이름이 4글자인 요리만 필터링 ========");
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 요리중에 300칼로리 보다 큰 요리 ========");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========================================");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("=========== 메뉴 목록에서 처음 등장하는 생선 요리 2개 ===========");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        List<Integer> numbers = List.of(1, 2, 1, 2, 3, 3, 4, 5, 6,6);
        // 짝수만 걸러내기
        List<Integer> filteredNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복 제거
                .collect(toList());
        System.out.println("filteredNumber = " + filteredNumber);

        // 중복 제거
//        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
//        System.out.println("distinctNumbers = " + distinctNumbers);

    }

}
