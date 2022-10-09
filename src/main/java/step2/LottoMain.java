package step2;

import java.util.ArrayList;
import java.util.List;

import static step2.Calculator.*;
import static step2.LottoMachine.getLotto;

public class LottoMain {
    public static final int LOTTO_PRICE = 1000;

    public static void main(String[] args) {
        int lottoNum = InputView.buyLotto() / LOTTO_PRICE;
        ResultView.printLottoCount(lottoNum);

        List<Lotto> autoLottoLists = autoLottoLists(lottoNum);
        ResultView.printLottoNum(autoLottoLists);

        Lotto lastWinner = new Lotto(InputView.getLastWinner());
        List<Integer> results = Lotto.compareWithLastLotto(autoLottoLists, lastWinner);
        ResultView.printDrawResult(results);

        int revenue = calculateRevenue(results);
        ResultView.printPercentage(calculatePercentage(lottoNum * LOTTO_PRICE, revenue));
    }

    private static List<Lotto> autoLottoLists(int lottoNum) {
        List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < lottoNum; i++) {
            lottoList.add(getLotto());
        }
        return lottoList;
    }
}
