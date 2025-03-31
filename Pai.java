import java.util.ArrayList;
//13種類の牌の情報を保持するクラス

public class Pai {
    ArrayList<String> paiTypes;

    public Pai() {
        this.paiTypes = new ArrayList<String>();

        // review: addではなくて = { ... }って感じで一括で宣言した方がいい
        // review: Paiクラスに定義してほしいのは複数の牌の情報ではなくて、Paiに共通する動作や１つの牌情報なので、牌の情報を作成するのはYamaの方がいいかも
        // 牌を追加する
        paiTypes.add("1萬");
        paiTypes.add("9萬");
        paiTypes.add("1筒");
        paiTypes.add("9筒");
        paiTypes.add("1索");
        paiTypes.add("9索");
        paiTypes.add("東");
        paiTypes.add("南");
        paiTypes.add("西");
        paiTypes.add("北");
        paiTypes.add("白");
        paiTypes.add("發");
        paiTypes.add("中");
    }

    public ArrayList<String> getPaiTypes() {
        return paiTypes;
    }
}