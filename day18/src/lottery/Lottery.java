package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다.

List<Integer> 타입 변수에 구현체를 대입해주시고
해당 변수에 중복 없이 6개의 번호가 들어가도록 해 주세요.

2. 1번 과제를 마친 분들은 당첨될때까지 다시 번호를 무작위로 계속 뽑는 코드를 작성해서 몇 번 만에 로또복권이 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.

hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만
[1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
 */
public class Lottery {
    public static void main(String[] args) {
        List<Integer> lottery = new ArrayList<>();
        Random random = new Random();

         // 중복인지 확인 위한 변수
        while (lottery.size() < 6){
            int winningNumber = random.nextInt(45)+1;
            if (lottery.contains(winningNumber)){ // 이전 번호와 중복이면
                continue;
            }
            lottery.add(winningNumber); // 복권 번호 순서 정렬
        }
        Collections.sort(lottery);
        // ---------------------

        int howManyDoYouBuyLottery = 0;
        List<Integer> myLottery = new ArrayList<>();
        while (!myLottery.equals(lottery)){
            myLottery = new ArrayList<>();
            while (myLottery.size() < 6){
                int boughtNumber = random.nextInt(45)+1;
                if (myLottery.contains(boughtNumber)){
                    continue;
                }
                myLottery.add(boughtNumber);
                howManyDoYouBuyLottery++;
            }
            Collections.sort(myLottery); // 복권 번호 순서 정렬
            // System.out.println(myLottery); // 잘 사고 있는지 확인용
        }
        int howMuchDoYouSpentMoneyLottery = howManyDoYouBuyLottery * 5000;
        System.out.println("당첨 되었습니다 ! 당첨 번호 : "+lottery);
        System.out.println("당신이 산 복권 번호 : "+myLottery);
        System.out.println("당신이 여태까지 산 복권의 개수를 기억하시나요? : "+howManyDoYouBuyLottery);
        System.out.println("당신은 복권에 무려 "+howMuchDoYouSpentMoneyLottery+" 원이나 쓰셨습니다!");
    }
}
