//山札から14枚の手牌を作成するクラス

import java.util.ArrayList;

public class Tehai {
    private ArrayList<String> tehaiList;

    public Tehai(Yama yama) {  //山札から14枚引いて手牌にする
        this.tehaiList = new ArrayList<String>();

        ArrayList<String> yamaList = yama.getPaiList();
        for (int i = 0; i < 14; i++) {
            tehaiList.add(yamaList.get(i));
        }
    }

    public ArrayList<String> getTehaiList() {
        return tehaiList;
    }

}
