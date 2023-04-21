package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// 미국 로또 버전으로 바꾸기
// 번호 5개 + 추가번호 1개
public class Lottery {
    public static void main(String[] args) {
        List<Integer> powerWinNumbers = new ArrayList<>();
        Random random = new Random();

         // 중복인지 확인 위한 변수
        while (powerWinNumbers.size() < 5){
            int winningNumber = random.nextInt(1, 70);
            if (powerWinNumbers.contains(winningNumber)){ // 이전 번호와 중복이면
                continue;
            }
            powerWinNumbers.add(winningNumber); // 복권 번호 순서 정렬
        }
        Collections.sort(powerWinNumbers);
        Integer powerWinNumber
                = random.nextInt(1, 27); // 추가번호 1개

        // ---------------------

        int howManyDoYouBuyLottery = 0;
        Integer myPowerLotteryNumber = 0;
        List<Integer> myPowerLotteryNumbers = new ArrayList<>();
        while (!(myPowerLotteryNumbers.equals(powerWinNumbers) &&
                powerWinNumber.equals(myPowerLotteryNumber)) ){ // 둘다 true 인 뒤에 false 인지를 판단해야 하므로, !a && !b 가 아닌 !(a && b)
            myPowerLotteryNumbers = new ArrayList<>();
            while (myPowerLotteryNumbers.size() < 5){
                int boughtNumber = random.nextInt(1, 70);
                if (myPowerLotteryNumbers.contains(boughtNumber)){
                    continue;
                }
                myPowerLotteryNumbers.add(boughtNumber);
                howManyDoYouBuyLottery++;
            }
            myPowerLotteryNumber = random.nextInt(1, 27); // 메가볼 1개
            Collections.sort(myPowerLotteryNumbers); // 복권 번호 순서 정렬
            // System.out.println(myPowerLotteryNumbers); // 잘 사고 있는지 확인용
        }
        long howMuchDoYouSpentMoneyLottery = (long)howManyDoYouBuyLottery * 2000;
        System.out.println("당첨 되었습니다 ! 당첨 번호 : "+powerWinNumbers + " + " + powerWinNumber);
        System.out.println("당신이 산 복권 번호 : "+myPowerLotteryNumbers+ " + " + myPowerLotteryNumber);
        System.out.println("당신이 여태까지 산 복권의 개수를 기억하시나요? : "+howManyDoYouBuyLottery);
        System.out.println("당신은 복권에 무려 "+howMuchDoYouSpentMoneyLottery+" 원이나 쓰셨습니다!");
    }
}
