import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Player {

    private List<Pai> tehai = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // 手牌を得る
    public List<Pai> getTehai() {
        return tehai;
    }

    // 牌山から14枚引いて手牌を作る
    public void createTehai(List<Pai> shuffledYama) {
        for (int i = 0; i < 14; i++) {
            tehai.add(shuffledYama.get(i));
        }
    }

    // 手牌を並べて表示する
    public void showTehai() {
        for (int key = 1; key <= 13; key++) {
            for (int j = 0; j < 14; j++) {
                if (tehai.get(j).getKey() == key) {
                    System.out.print(tehai.get(j) + " ");
                }
            }
        }

        System.out.println();
    }

    // 牌を山から引く
    public void drawPai(List<Pai> shuffledYama, int yamaNumber) {
        tehai.add(shuffledYama.get(yamaNumber));
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
    public void tumoMovement(GameManager gameManager, Map<Integer, String> paiTypes, List<Pai> shuffledYama,
            int yamaNumber) {
        System.out.println("捨てる牌に対応した番号を入力してください");
        gameManager.showPaiAndNumber(paiTypes);
        discardPai();
        drawPai(shuffledYama, yamaNumber);
        showTehai();
    }
}