package oop.inter.good;

public class Login implements IUserService{
    public Login() {
        System.out.println("로그인 요청이 들어옴!");
    }


    @Override
    public void execute() {
        System.out.println("사용자가 입력한 id,pw를 가져와서 데이터베이스와의 비교 등등등....");
    }
}
