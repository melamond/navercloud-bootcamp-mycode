package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // void 파라미터 시 현재시간
        Date date = new Date();
        System.out.println(date);

        // 현재시간 이외 시간 입력시
        Date date2 = new Date(122, 10, 9, 18, 30, 0); // Deprecated 사용안하는 양식
        System.out.println(date2);

        /*
        날짜 양식바꾸기
        1. SimpleDateFormat 객체 생성하는데, 표현 양식 넣어 생성
        예시 ) 2023 년 4월 20 일 10 시 09 분 28 초 형식으로 양식 생성
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년 MM 월 dd 일 HH 시 mm 분 ss 초");

        // 2. sdf.format(Date타입변수); 를 넣어 콘솔에 찍기
        System.out.println(sdf.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 E요일 입니다. " +
                "오늘은 1년 중 D번째 날입니다.");
        System.out.println(sdf2.format(date));
    }
}
