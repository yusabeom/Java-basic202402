package etc.exception.custom;

public class LoginValidateException extends Exception{ //규칙 상속
    // 기본 생성자

    public LoginValidateException() {
    }

    // 커스텀 에러 메세지를 받는 생성자.


    public LoginValidateException(String message) {
        super(message);
    }
}
