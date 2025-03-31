//ゲーム全体の流れを管理するクラス

public class GameManager {
    private Pai pai; // 牌を管理
    private Yama yama; // 山を管理
    private Tehai tehai; // 手牌を管理

    // ゲームの開始処理をまとめたメソッド
    public void startGame() {
        this.pai = new Pai(); // 牌の種類を定義
        this.yama = new Yama(pai); // 山札(52枚)をつくる
        this.tehai = new Tehai(yama); // 山から14枚を引いて手牌にする

        // 手牌を表示
        System.out.println("配られた手牌:");
        for (String pai : tehai.getTehaiList()) {
            System.out.print(pai + "  ");
        }
    }

}
