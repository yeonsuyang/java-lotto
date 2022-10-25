package step4;

import step3.domian.Lotto;
import step4.domian.LastWinner;
import step4.domian.LottoResult;
import step4.domian.LottoWallet;
import step4.domian.Revenue;
import step4.view.InputView;
import step4.view.ResultView;

import java.util.List;

import static step4.domian.LottoMachine.autoLottos;

public class LottoMain {
    public static final int LOTTO_PRICE = 1000;

    public static void main(String[] args) {
        int lottoNum = InputView.buyLotto() / LOTTO_PRICE;
        int manualNum = InputView.inputManualNum();
        List<Lotto> manualLottos = InputView.inputManualLottos(manualNum);

        LottoWallet lottoWallet = autoLottos(lottoNum);
        ResultView.printLottoNum(lottoWallet);

        LastWinner lastWinner = new LastWinner(InputView.inputLastWinner(), InputView.inputLastBonus());
        LottoResult results = lottoWallet.compareWithLastLotto(lastWinner);
        ResultView.printDrawResult(results);

        Revenue revenue = new Revenue(results);
        ResultView.printPercentage(revenue.calculatePercentage(lottoNum * LOTTO_PRICE));
    }
}
