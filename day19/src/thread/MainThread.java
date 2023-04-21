package thread;

// 주 쓰레드 역할을 할 클래스
public class MainThread {
    public static void main(String[] args) {
        // 보조 쓰레드 실행을 위해서는 먼저 Thread 객체를 생성해야 합니다
        // 1. Runnable 구현체를 생성
        Runnable trd = new MultiThread();

        // 2. Thread 클래스 인스턴스를 생성해주세요
        // 생성자 호출 시 위의 Runnable 구현체를 파라미터로 넘겨줍니다
        Thread sTrd = new Thread(trd);
        System.out.println("보조 쓰레드 준비 완료");

        // 3. 보조 쓰레드는 .start() 으로 호출할 수 있습니다
        // sTrd.run(); // run을 직접 호출해버리면 싱글 쓰레드 구조가 되어버림
        sTrd.start();
        System.out.println("먼저 끝날지 알 수 없는 메인 쓰레드");
    }
}
