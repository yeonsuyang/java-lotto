package step2.domian;

import step2.domian.Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoMachine {

    private static List<Integer> initLottoNum = IntStream.rangeClosed(0, 45).boxed().collect(Collectors.toList());

    public static List<Lotto> autoLottoLists(int lottoNum) {
        List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < lottoNum; i++) {
            lottoList.add(getNewLotto());
        }
        return lottoList;
    }

    private static Lotto getNewLotto() {
        return new Lotto(getAutoNum());
    }

    private static List<Integer> getAutoNum() {
        Collections.shuffle(initLottoNum);
        return new ArrayList<>(initLottoNum.subList(0, 6));
    }
}