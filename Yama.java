//52枚の山札を生成しランダムにシャッフルするクラス

import java.util.ArrayList;
import java.util.Collections;

// review: 捨て牌のクラスが必要
public class Yama {
    private ArrayList<Pai> yamaList; // 牌山を管理するリストを作成

    // 牌山を生成する
    public Yama(ArrayList<Pai> paiList) {

        yamaList = new ArrayList<>(); // 山札を初期化

        // 牌の種類を4枚ずついれて合計52枚にする
        for (int j = 0; j < 4; j++) {
            for (Pai pai : paiList) {
                yamaList.add(new Pai(pai.getType()));
            }
        }
        // 山をシャッフルする
        Collections.shuffle(yamaList);

    }

    // 山札を取得するメソッド
    public ArrayList<Pai> getYamaList() {
        return yamaList;
    }

}
