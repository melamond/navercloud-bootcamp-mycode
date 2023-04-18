package exception.runtime;

public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
       // str = "Hello";

        //toLowerCase 는 모든 문자를 소문자로
        System.out.println(str.toLowerCase());
    }
}
