//52枚の山札を生成しランダムにシャッフルするクラス

import java.util.ArrayList;
import java.util.Collections;
// review: 捨て牌のクラスが必要
public class Yama {
    ArrayList<String> paiList;

    public Yama(Pai pai) {
        this.paiList = new ArrayList<String>();
        ArrayList<String> paiTypes = pai.getPaiTypes();
        
        // review: ここで牌を作成する処理を追加する

        // 牌の種類を4枚ずついれて合計52枚にする
        for (int j = 0; j < paiTypes.size(); j++) {
            String paiType = paiTypes.get(j);

            for (int i = 0; i < 4; i++) {
                paiList.add(paiType);
            }
        }
        // 山をシャッフルする
        Collections.shuffle(paiList);

    }

    public ArrayList<String> getPaiList() {
        return paiList;
    }
}
