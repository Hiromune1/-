import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class GameManager {

    private List<Pai> yama;
    // 牌山を作る
    public void createYama() {
        this.yama = new ArrayList<>();
    }

    // 牌を作って牌山に保存
    public List<Pai> createPai(Map<Integer, String> paiTypes) {
        for (Integer key : paiTypes.keySet()) {
            String value = paiTypes.get(key);
            for (int i = 0; i < 4; i++) {
                Pai pai = new Pai(value, key);
                yama.add(pai);
            }
        }
        List<Pai> addedYama = new ArrayList<>(yama);
        return addedYama;
    }

    // 牌山の中身をシャッフルする
    public List<Pai> shuffleYama(List<Pai> addedYama) {
        Collections.shuffle(addedYama);
        List<Pai> shuffledYama = new ArrayList<>(addedYama);
        return shuffledYama;
    }

}
