package step2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static step2.Counter.countSameNumber;

public class Lotto {
    public List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static List<Integer> compareWithLastLotto(List<Lotto> lottoLists, Lotto lastWinner) {
        List<Integer> results = new ArrayList<>(Collections.nCopies(7, 0));
        for (int i = 0; i < lottoLists.size(); i++) {
            int count = (countSameNumber(lastWinner, lottoLists.get(i)));
            results.set(count,results.get(count) + 1);
        }
        return results;
    }
}
