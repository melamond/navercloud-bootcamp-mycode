package threadtest;

public class ThreadNotSafety2 extends Thread {

    static int share;

    public static void main(String[] args) {
        ThreadNotSafety2 t1 = new ThreadNotSafety2();
        ThreadNotSafety2 t2 = new ThreadNotSafety2();

        t1.start();
        t2.start();
    }

    // 쓰레드안전을 위해 사용하는 메소드
    public synchronized static void sharePlus(){
        System.out.println(share++);
    }
    public void run() {
        for(int count = 0; count < 10; count++){
            sharePlus(); // 메소드를 이용해 share 1 증가
            try { sleep(1); }
            catch (InterruptedException e) {}
        }
    }
}
