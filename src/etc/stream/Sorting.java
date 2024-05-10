package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;

public class Sorting {
    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차순 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 높은 순 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("================================================");
        // 500 칼로리보다 작은 요리중 탑 3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
