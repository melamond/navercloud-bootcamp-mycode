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
    public List<Integer> getLottoNumbers(){
        List<Integer> lottoNumbers = new ArrayList<>();
        while (lottoNumbers.size() < 6){
            Integer getNumber = rn.nextInt(1, 46);
            if (!lottoNumbers.contains(getNumber)){
                lottoNumbers.add(getNumber);
            }
        }
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }

    public int getCount() { // 시도 횟수 카운트값 조회 Getter
        return this.count;
    }

    public void addCount(){ // 한바퀴 돌때마다 카운트 증가
        this.count++;
    }

    public void tryWinLoop(List<Integer> winNumbers,
                                      List<Integer> getNumbers){
        while (!winNumbers.equals(getNumbers)){ // 당첨 될때까지 비교하는 메서드
            getNumbers = getLottoNumbers();
            addCount();
        }
    }
}
