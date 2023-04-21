package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorGoodCase {
    private int count; // 시도 횟수 조사 멤버변수
    private static Random rn;

    static {
        rn = new Random();
    }
    // 메소드는 기능 하나를 담당해야 한다
    // 1~45 까지의 난수를 하나 뽑는 용도로 메소드 작성
    public List<Integer> getPowerNumbers(){
        List<Integer> powerNumbers = new ArrayList<>();
        while (powerNumbers.size() < 5){
            Integer getNumber = rn.nextInt(1, 70);
            if (!powerNumbers.contains(getNumber)){
                powerNumbers.add(getNumber);
            }
        }
        Collections.sort(powerNumbers);
        return powerNumbers;
    }

    public Integer getPowerNumber(){
        return new Random().nextInt(1, 27);
    }

    public int getCount() { // 시도 횟수 카운트값 조회 Getter
        return this.count;
    }

    public void addCount(){ // 한바퀴 돌때마다 카운트 증가
        this.count++;
    }

    public void tryWinLoop(List<Integer> winNumbers, List<Integer> getNumbers, Integer winNumber, Integer getNumber){
        while (!(winNumbers.equals(getNumbers) && winNumber.equals(getNumber))){ // 당첨 될때까지 비교하는 메서드
            getNumbers = getPowerNumbers();
            getNumber = getPowerNumber();
            addCount();
        }
        System.out.println("당첨 번호 : " + winNumbers + " + " + winNumber);
        System.out.println("구매 번호 : " + getNumbers + " + " + getNumber);
    }
}
