package oop.obj_arr;

public class Score {

        /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

    String name;
    int korean;
    int english;
    int math;
    int total;
    double average;

    public Score() {
    }

    public Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.setTotalAndAvg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

//    public void setTotal() {
//        this.total = this.korean + this.english + this.math;
//    }

    public double getAverage() {
        return average;
    }

//    public void setAverage() {
//        this.average = this.total/3.0;
//    }

    public void scoreInfo(){
        System.out.printf("이름: %s  국어: %d점  영어: %d점  수학: %d점\n총점: %d점  평균: %.2f점\n",
                name, korean, english, math, total, average);
    }
    //점수 유효성 검증
    public static boolean isValidateScore(int score){
        if (score > 100 || score < 0){
            System.out.println("유효하지 않은 점수입니다.(0 ~ 100)");
            return false;
        }
        return true;
    }

    //총점과 평균을 계산 세팅메서드
    public void setTotalAndAvg(){
        this.total = this.korean + this.english + this.math;
        this.average = this.total / 3.0;
    }

    // 내가함    public Score() {
//    }
//
//    public Score(String name, int korean, int english, int math) {
//        this.name = name;
//        this.korean = korean;
//        this.english = english;
//        this.math = math;
//        this.total = korean+english+math;
//        this.average = (double) total /3;
//    }
//
//    void scoreInfo (){
//        System.out.printf("이름: %s\n총점: %d점\n평균: %.2f점\n",name,this.total,this.average);
//        System.out.println("----------------------------------------------");
//    }

}
