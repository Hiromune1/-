import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class GameManager {
    // re:これでできる
    public List<Pai> yama = new ArrayList<>();

    // // 牌山を作る
    // public void createYama() {
    //     this.yama
    // }

    // 牌を作って牌山に保存
    public List<Pai> createPai(Map<Integer, String> paiTypes) {
        // for (Integer key : paiTypes.keySet()) {
        //     String value = paiTypes.get(key);
        //     for (int i = 0; i < 4; i++) {
        //         yama.add(new Pai(value, key));
        //     }
        // }
        // re:こっちのほうがきれい
        for (Map.Entry<Integer, String> entry : paiTypes.entrySet()) {
            for (int i = 0; i < 4; i++) {
                yama.add(new Pai(entry.getValue(), entry.getKey()));
            }
        }
        return new ArrayList<>(yama);
    }

    // 牌山の中身をシャッフルする
    // public List<Pai> shuffleYama(List<Pai> addedYama) {
    //     Collections.shuffle(addedYama);
    //     List<Pai> shuffledYama = new ArrayList<>(addedYama);
    //     return shuffledYama;
    // }
    // re: 渡さなくてもフィールド変数を直接シャッフルできる
    public void shuffleYama() {
        Collections.shuffle(yama);
    }

    // 牌に対応した数字を出力する
    public void showPaiAndNumber(Map<Integer, String> paiTypes) {
        for (int key = 1; key <= 13; key++) {
            String word = paiTypes.get(key);
            System.out.print(word + "→ " + key + " ");
        }

        System.out.println();
    }
    
    // re: いろんなあがり方があるから一旦は一番一般的な上がり方にフォーカスして実装してみて、
    // その時に、引数がとか書き方が汚いとか色々思うかもしれないけど一度書いて、出来てからそのあたりは考えよう
    // 初めから完璧を目指すのは難しすぎると思うから
    // それと何か書いてないとアドバイスもできないから

    // 手牌が上がり形になっているか判定する
    public void  judegeTehai() {
        boolean result = false;
        for (false) {
            player.tumoMovement()
        }
    }

}
