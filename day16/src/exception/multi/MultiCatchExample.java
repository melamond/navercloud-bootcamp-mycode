package exception.multi;

import exception.runtime.NullPointerExample;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(new StringBuffer("1번째 데이터"));
            String data1 = sc.next();
            System.out.println(new StringBuffer("2번째 데이터"));
            String data2 = sc.next();

            // NumberFormatException 발생가능
            int i = Integer.parseInt(data1);
            int j = Integer.parseInt(data2);

            // ArithmeticException 발생가능
            int result = i / j;
            System.out.println(new StringBuffer().append(i).append("/").append(j).append("=").append(result));
            // 위와 아래는 같음
            System.out.println(i + "/" + j + "=" + result);

            // NullPointerException 발생 가능
            String str = null;
            str.charAt(0); // 문자열 0번째 문자만 인덱싱 인데 Null
        }catch (NumberFormatException | NullPointerException e){
            System.err.println(new StringBuffer("데이터를 숫자만 넣어주세요"));
            System.err.println(new StringBuffer("또는 데이터를 제대로 넣어주세요"));
        }catch (ArithmeticException e){
            System.err.println(new StringBuffer("0으로 나눌수 없습니다"));
        }catch (Exception e){
            System.err.println(new StringBuffer("알수 없는 에러가 발생했습니다"));
            System.err.println(new StringBuffer("복구중..."));
        }finally {
            sc.close();
        }
    }
}
