package api.util.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();

        //nextDouble() = 0.0 이상 1.0 미만 실수 난수 리턴
        double d = r.nextDouble();
        System.out.println("실수 랜덤값 : " + d);

        // nextBoolean() : 논리 랜덤값
        boolean b = r.nextBoolean();
        System.out.println("논리 랜덤값 : " + b);

        // nextInt() : 정수 랜덤값 리턴하는
        // 정수 int 모든 범위에서 난수발생
        int i = r.nextInt();
        System.out.println("정수 랜덤값 : " + i);

        // 정수 0 이상 10 미만 난수 발생
        i = r.nextInt(10);
        System.out.println("정수 0~9 : " + i);

        // 정수 1 이상 11 미만 난수 발생
        i = r.nextInt(10) + 1;
        System.out.println("정수 1 ~ 10 : " + i);
    }
}
