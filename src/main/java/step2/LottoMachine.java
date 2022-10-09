package step2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoMachine {

    private static List<Integer> initLottoNum = IntStream.rangeClosed(0,45).boxed().collect(Collectors.toList());

    public static Lotto getLotto(){
        return new Lotto(getAutoNum());
    }
    public static List<Integer> getAutoNum() {
        Collections.shuffle(initLottoNum);
        return new ArrayList<>(initLottoNum.subList(0, 6));
    }
}
