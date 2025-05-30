import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * review
 * this.tehaiで書かせてきたが基本的に省略して記述する
 * 以下の場合のように同じ変数が並んだときは宣言する。
 * 例：
 * public setTehai(List<Pai> tehai) {
 *  this.tehai = tehai
 *  （メンバー変数の手牌 = 引数の手牌）
 * }
 * 
 * それと、コンフリクト（変更の競合）が起きていたため、プルしてからコミットは絶対！！！！！！！！
 */

public class Player {
    // review:初期宣言はここでいい、値を入れるならコンストラクタ
    private List<Pai> tehai = new ArrayList<>();

    // public Player() {
    //     this.tehai = new ArrayList<>();
    // }

    Scanner scanner = new Scanner(System.in);

    // 手牌を得る
    public List<Pai> getTehai() {
        return tehai;
    }

    // 牌山から14枚引いて手牌を作る
    public void createTehai(List<Pai> shuffledYama) {
        for (int i = 0; i < 14; i++) {
            this.tehai.add(shuffledYama.get(i));
        }
    }

    // 手牌を並べて表示する
    public void showTehai() {
        for (int key = 1; key <= 13; key++) {
            for (int j = 0; j < 14; j++) {
                if (this.tehai.get(j).getKey() == key) {
                    System.out.print(this.tehai.get(j) + " ");
                }
            }
        }

        System.out.println();
    }

    // 牌を山から引く
    public void drawPai(List<Pai> shuffledYama) {
        this.tehai.add(shuffledYama.get(0));
    }

    // 牌を捨てる
    public void discardPai() {
        System.out.println("捨てる牌を選んで下さい");
        String discardPai = scanner.nextLine().trim();

        for (int i = 0; i < tehai.size(); i++) {
            if (this.tehai.get(i).getPaiName().equals(discardPai)) {
                this.tehai.remove(i);
            }
        }
        System.out.println("正しい牌を入力してください");
    }
}