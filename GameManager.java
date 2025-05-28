import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class GameManager {

    private List<Pai> yama;
    /* 
     * review: 
     * コメントのつけ方
     * 関数は関数の前がいい
     * for, whileは前か後がいい
     * 変数は同じ行か前がいい
     * 処理の説明はコメントが10文字程度なら同じ行、長ければ前がいい
     */
    // 牌山を作る
    public void createYama() {
        this.yama = new ArrayList<>();
    }

    public List<Pai> createPai(Map<Integer, String> paiTypes) { // 牌を作って牌山に保存
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

    public List<Pai> shuffleYama(List<Pai> addedYama) { // 牌山の中身をシャッフルする
        Collections.shuffle(addedYama);
        List<Pai> shuffledYama = new ArrayList<>(addedYama);
        return shuffledYama;
    }

}
