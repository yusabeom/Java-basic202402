package etc.api.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

    public static Random r = new Random();

    public static int prize1 = 0; // 1등 당첨 횟수를 기억할 변수.
    public static int prize2 = 0; // 2등 당첨 횟수를 기억할 변수.
    public static int prize3 = 0; // 3등 당첨 횟수를 기억할 변수.
    public static int prize4 = 0; // 4등 당첨 횟수를 기억할 변수.
    public static int prize5 = 0; // 5등 당첨 횟수를 기억할 변수.
    public static int failCnt = 0; // 미당첨 횟수를 기억할 변수.


    public static Set<Integer> createLotto() {
        Set<Integer> lottoNums = new HashSet<>();
        while (!(lottoNums.size() == 6)){
            int num = r.nextInt(45)+1;
            lottoNums.add(num);
        }
        return lottoNums;
    }

    // 보너스 번호를 생성하는 메서드
    public static int createBonusNum(Set<Integer> win){
        while (true){
            int bonus = r.nextInt(45)+1;
            if (!win.contains(bonus)){
                return bonus;
            }
        }
    }

    // 당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(Set<Integer> win, Set<Integer> my,int bonus){
        /*
             매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
             내 로또 번호와 당첨번호를 비교하여
             일치하는 횟수를 세 주신 후 등수를 판단하세요.
             판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
             6개 일치 -> 1등
             5개 일치 + 보너스번호 일치 -> 2등
             5개 일치 -> 3등
             4개 일치 -> 4등
             3개 일치 -> 5등
             나머지 -> 꽝
         */
        int r = 0;
        for (Integer i : my) {
            if(win.contains(i)){
                r++;
            }
        }
        if (r == 6){
            prize1++;
        } else if (r == 5 && my.contains(bonus)) {
            prize2++;
        } else if (r == 5) {
            prize3++;
        } else if (r == 4) {
            prize4++;
        } else if (r == 3) {
            prize5++;
        } else failCnt++;
    }


    public static void main(String[] args) {
        // 당첨 번호 고정
        Set<Integer> win = createLotto();

        //보너스 번호 고정
        int bonus = createBonusNum(win);


        int paper = 0;
        long cost = 0;
        while (true) {
            Set<Integer> myLotto = createLotto(); //로또 구매(자동)
            paper++; cost+=1000;
            checkLottoNumber(win,myLotto,bonus); // 등수 확인

            if (prize1 == 1) {
                System.out.println("2등 = " + prize2);
                System.out.println("3등 = " + prize3);
                System.out.println("4등 = " + prize4);
                System.out.println("5등 = " + prize5);
                System.out.println("꽝 = " + failCnt);
                System.out.println("산 횟수: "+paper +"\n 누적금액: "+cost);
                System.out.println(win);

                break;
            }

        }

    }
}
