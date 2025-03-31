//山札から14枚の手牌を作成するクラス

import java.util.ArrayList;
// review: 将来的にみてPlayerクラスの方がいいかも
public class Tehai {
    private ArrayList<String> tehaiList;

    public Tehai(Yama yama) {  //山札から14枚引いて手牌にする
        this.tehaiList = new ArrayList<String>();

        // review: yama.getPaiList()でpaiListから牌を配布しているが、渡した牌をpaiListから削除したい
        // (yamaクラスに渡す処理と除外する処理を行う関数を追加してもいい)
        ArrayList<String> yamaList = yama.getPaiList();
        for (int i = 0; i < 14; i++) {
            tehaiList.add(yamaList.get(i));
        }
    }

    public ArrayList<String> getTehaiList() {
        return tehaiList;
    }

}
