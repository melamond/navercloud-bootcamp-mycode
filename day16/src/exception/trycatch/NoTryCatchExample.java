package exception.trycatch;

import java.util.Scanner;

public class NoTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prevValue = sc.nextInt();
        int nextValue = sc.nextInt();
        // nextValue 에 0만 아니면 예외없음

        // try catch 이전의 예외처리 방식
        if(nextValue !=0){
            System.out.println(prevValue/nextValue);
        }
        else{
            System.out.println("0을 나누는 값으로 넣을수 없습니다");
        }


        sc.close();
    }
}
