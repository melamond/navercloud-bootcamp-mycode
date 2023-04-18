package exception.throws_;

public class ThrowsExample {
    public static String [] greetings = {"안녕", "니하오", "헬로"};
    /*
    예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
    예외 처리를 메서드 호출지역으로 떠넘기는 것을 throws라고 한다
    메서드 혹은 생성자 호출시 예외처리를 강요하고 싶을 경우 사용
     */
    public static void greet(int idx) throws Exception{
        System.out.println(greetings[idx]);
    }
    public static void main (String[] args){
        /*
         - throws 가 붙은 메서드나 생성자 호출시
         try 블록 내부에서 호출해야 예외처리를 진행해준다
         */
        try{
            greet(3);
        }catch (Exception e){
            /*
             - printStackTrace() 는 예외발생경로를 추적하는 메세지 출력
             - 주로 개발과정에서 예외원인을 찾을때 유용하다
             */
            e.printStackTrace();
        }
        System.out.println("프로그램 정상종료");
    }
}
