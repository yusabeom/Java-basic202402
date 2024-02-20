package basic.casting;

public class CastingExample3 {
    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        int intResult = c + i;
        char charResult = (char) (c + i);
        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);
        
        int k = 10;
        double d = k / 4.0; //int k와 int 4가 연산되면 정수값이 도출되기때문에 소수점이 필요하면 실수요소가 하나 필요함.
//        double d = (double) k / 4.0;  -> 이렇게도 가능함

        System.out.println("d = " + d);

    }
}
