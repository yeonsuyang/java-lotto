package step2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoGenerated {

    private static final List<Integer> initLottoNum = initLottoNum();
    public static List<Integer> getLotto() {
        Collections.shuffle(initLottoNum);
        return initLottoNum.subList(0, 6);
    }

    private static List<Integer> initLottoNum() {
        for (int i = 1; i <= 45; i++) {
            initLottoNum.add(i);
        }
        return initLottoNum;
    }
}
