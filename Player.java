import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Player {
    private List<Pai> tehai;

    public Player() {
        this.tehai = new ArrayList<>();
    }

    Scanner scanner = new Scanner(System.in);

    // 手牌を得る
    public List<Pai> getTehai() {
        return tehai;
    }

    // 牌山から14枚引いて手牌を作る
    public List<Pai> createTehai(Yama yama) {
        for (int i = 0; i < 14; i++) {
            tehai.add(yama.getYama().get(i));
        }
        return tehai;
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
    public void drawPai(Yama yama) {
        Pai drawn = yama.getYama().remove(0);
        tehai.add(drawn);
    }

    // 牌を捨てる
    public void discardPai() {
        Integer number = scanner.nextInt();
        for (int i = 0; i < 14; i++) {
            if (tehai.get(i).getKey() == number) {
                tehai.remove(i);
                break;

            }
        }
    }

    // 一連のツモ動作
    public boolean tumoMovement(GameManager gameManager, Yama yama) {
        System.out.println(
                "========================================================================================");
        this.showTehai();

        if (gameManager.judegeTehai(tehai)) {
            return true;
        }
        System.out.println();
        gameManager.showPaiAndNumber();
        this.discardPai();
        this.drawPai(yama);

        return false;
    }
}