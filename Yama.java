import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Yama {
    private List<Pai> yama;

    public Yama() {
        this.yama = new ArrayList<>();
    }

    public List<Pai> getYama() {
        return yama;
    }

    // 牌を作って牌山に保存
    public List<Pai> createPai(GameManager gameManager) {
        Map<Integer, String> paiTypes = gameManager.getPaiTyps();
        for (Integer key : paiTypes.keySet()) {
            String value = paiTypes.get(key);
            for (int i = 0; i < 4; i++) {
                Pai pai = new Pai(value, key);
                yama.add(pai);
            }
        }
        return yama;
    }

    // 牌山の中身をシャッフルする
    public List<Pai> shuffleYama() {
        Collections.shuffle(yama);
        return yama;
    }
}
