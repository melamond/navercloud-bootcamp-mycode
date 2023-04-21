package lottery;

import java.util.List;

public class LottoWinSimulatorMain {
    public static void main(String[] args) {
        LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();

        List<Integer> lottoWinNumbers = ls.getPowerNumbers();

        Integer lottoWinNumber = ls.getPowerNumber();

        List<Integer> lottoGetNumbers = ls.getPowerNumbers();

        Integer lottoGetNumber = ls.getPowerNumber();

        ls.tryWinLoop(lottoWinNumbers, lottoGetNumbers, lottoWinNumber, lottoGetNumber);

        System.out.println("딩신은 지금까지 "+ls.getCount()+" 장의 로또를 샀습니다.");
    }
}
