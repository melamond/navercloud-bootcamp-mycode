package exception.trycatch;

public class TryCatchExample2 {
    public static void main(String[] args) {
        String [] greetings = {"안녕", "Hello", "니하오", "싸왓디"};
        int i = 0;
        while (i < 5){
            try {
                System.out.println(greetings[i]);
            }catch (Exception e){
                System.err.println("배열의 참조범위 벗어남");
            } finally {
                System.out.println("없어도 되지만 로직이 블럭과 관련있을때 사용");
            }
            i++;
        }
        System.out.println("어쨌든 프로그램이 잘 종료됨");
    }
}
