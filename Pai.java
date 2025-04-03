
public class Pai {
    String type;

    public Pai(String type) { // 牌の種類を受け取って初期化
        this.type = type;
    }

    public String getType() { // 牌の種類を取得するメソッド
        return type;
    }

    public static String[] getPaiTypes() { // 牌の種類の一覧を返す静的メソッド
        return new String[] { "1萬", "9萬", "1筒", "9筒", "1索", "9索", "東", "南", "西", "北", "白", "發", "中" };
    }

}