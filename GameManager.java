import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class GameManager {
    public Map<Integer, String> paiTypes;

    // 牌に対応した数字を設定する
    public void putPaiTypes() {
        this.paiTypes = new HashMap<Integer, String>();

        paiTypes.put(1, "一萬");
        paiTypes.put(2, "九萬");
        paiTypes.put(3, "1筒");
        paiTypes.put(4, "9筒");
        paiTypes.put(5, "1索");
        paiTypes.put(6, "9索");
        paiTypes.put(7, "東");
        paiTypes.put(8, "南");
        paiTypes.put(9, "西");
        paiTypes.put(10, "北");
        paiTypes.put(11, "白");
        paiTypes.put(12, "發");
        paiTypes.put(13, "中");
    }

    // 牌の種類を返す
    public Map<Integer, String> getPaiTyps() {
        return paiTypes;
    }

    // 牌に対応した数字を出力する
    public void showPaiAndNumber() {
        for (int key = 1; key <= 13; key++) {
            String word = paiTypes.get(key);
            System.out.print(word + "→ " + key + " ");
        }

        System.out.println();
    }

    // 手牌が上がり形になっているか判定する
    public boolean judegeTehai(List<Pai> tehai) {

        for (int key = 1; key <= 13; key++) {
            boolean found = false;

            for (Pai pai : tehai) {
                if (pai.getKey() == key) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        System.out.println("国士無双！");
        return true;
    }
}
