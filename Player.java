//山札から14枚の手牌を作成するクラス

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Player {
    private ArrayList<Pai> tehai; // プレイヤーの手牌を管理
    private Yama yama;

    public Player(Yama yama) { // 山札から14枚引いて手牌にする yamaを引数として受ける
        this.tehai = new ArrayList<>();
        this.yama = yama;

        // 山札から14枚引いて手牌に追加する
        for (int i = 0; i < 14; i++) {
            Pai drawnPai = yama.getYamaList().remove(0); // 山札から1枚引く(先頭から取り除く)
            tehai.add(drawnPai); // 手牌に追加
        }
    }

    // 手牌を表示するメソッド
    public void showTehai() {
        System.out.println("配られた手牌：");
        for (Pai pai : tehai) {
            System.out.print(pai.getType() + "  ");
        }

    }

    public ArrayList<Pai> getTehai() {
        return tehai;
    }

    // 手牌を並び変えるメソッド
    public void sortTehai() {
        // 並び替えの基準となる順番リスト
        String[] order = { "1萬", "9萬", "1筒", "9筒", "1索", "9索", "東", "南", "西", "北", "白", "發", "中" };
        ArrayList<String> orderList = new ArrayList<>(Arrays.asList(order));

        // orderListに基づいて手牌を並び替える
        tehai.sort(Comparator.comparingInt(pai -> orderList.indexOf(pai.getType())));
    }

    // 捨てる牌を選択して新しい牌を山から一枚引くメソッド
    public void discardPai() {
        Scanner scanner = new Scanner(System.in);

        String choice;
        while (true) {
            System.out.println("捨てる牌を入力してください：");
            choice = scanner.next(); // ユーザーからの入力を受け取る
            boolean found = false; // 牌が見つかったかどうかを記録する変数

            // 入力された牌が手牌に存在するかチェックする
            for (int i = 0; i < tehai.size(); i++) {
                if (tehai.get(i).getType().equals(choice)) { // 手牌のi番目の牌を取得し、その牌の種類を取得。それが入力された文字列と等しいか比較
                    Pai discarded = tehai.remove(i); // 手牌から入力された牌を削除
                    Pai newPai = yama.getYamaList().remove(0); // 山札から一枚引く
                    tehai.add(newPai); // 手牌に追加
                    sortTehai(); // 手牌を並び替える
                    showTehai(); // 新しい手牌を表示する
                    found = true; // 捨てた牌が見つかったというフラグが立つ
                    break; // forループを終了させる

                }
            }

            if (found)
                break;
            System.out.println("手牌に存在しません。正しく入力してください："); // foundがfalseのままだとwhileループが続き再度入力を求められる
        }

    }
}
