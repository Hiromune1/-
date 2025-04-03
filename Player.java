//山札から14枚の手牌を作成するクラス

import java.util.ArrayList;

public class Player {
    private ArrayList<Pai> tehai; // プレイヤーの手牌を管理

    public Player(ArrayList<Pai> yamaList) { // 山札から14枚引いて手牌にする
        this.tehai = new ArrayList<>();

        // 山札から14枚引いて手牌に追加する
        for (int i = 0; i < 14; i++) {
            // review:以下2分は次の一行で書けちゃう
            // tehai.add(yamaList.remove(0))
            // yamaList.remove(0)の値をその後も使いたい場合は変数でOK
            Pai drawnPai = yamaList.remove(0); // 山札から1枚引く(先頭から取り除く)
            tehai.add(drawnPai); // 手牌に追加
        }
    }

    public ArrayList<String> getTehai() {
        return tehai;
    }

}
