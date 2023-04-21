package thread2;

public class Me {
    public static void main(String[] args) {
        // 프린터를 켜는건 사람
        Runnable prt = new Printer();
        Runnable arm = new AlarmMachine();

        Thread prtThread = new Thread(prt);
        Thread armThread = new Thread(arm);

        System.out.println("저녁 준비..");
        System.out.println("프린터 명령..");
        prtThread.start();
        armThread.start();
        try {
            System.out.println("밥을 합니다..");
            Thread.sleep(3000);
            System.out.println("밥을 합니다..");
            Thread.sleep(3000);
            System.out.println("밥 완성");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("배식, 설거지 완료");
    }
}
