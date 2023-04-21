package thread2;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("500장 프린트를 시작합니다");
        for (int i = 0; i < 500; i ++){
            try {
                System.out.println("프린터기가 프린트중");
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
