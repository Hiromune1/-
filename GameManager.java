//ゲーム全体の流れを管理するクラス

import java.util.ArrayList;

public class GameManager {
    private Pai pai; // 牌を管理
    private Yama yama; // 山を管理
    private Player player; // プレイヤーを管理
    private ArrayList<Pai> paiList; // 牌インスタンスの種類を管理

    // ゲームの開始処理をまとめたメソッド
    public void startGame() {
        paiList = new ArrayList<>(); // arrayListを初期化
        String[] paiTypes = Pai.getPaiTypes(); // Paiクラスの静的メソッドから牌の種類を取得

        // 各種類ごとにインスタンスを生成してpaiListに追加
        for (int i = 0; i < paiTypes.length; i++) {
            String type = paiTypes[i];
            Pai pai = new Pai(type);
            paiList.add(pai);
        }
        this.yama = new Yama(paiList); // 山札を生成
        this.player = new Player(yamaList);

        // 手牌を表示
        showTehai();
    }

    // review:手牌はプレイヤーごとに持っていると思うので、Playerクラスに宣言
    // 手牌を表示するメソッド
    private void showTehai() {
        System.out.println("配られた手牌：");
        for (Pai pai : player.getTehai()) {
            System.out.print(pai.getType() + "  ");
        }
    }
}
