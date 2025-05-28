import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Pai> tehai;

    public Player() {
        this.tehai = new ArrayList<>();
    }

    public List<Pai> createTehai(List<Pai> shuffledYama) { // 牌山から14枚引いて手牌をつくる
        for (int i = 0; i < 14; i++) {
            tehai.add(shuffledYama.get(i));
        }
        List<Pai> createdTehai = new ArrayList<>(tehai);
        return createdTehai;
    }

    public void showTehai(List<Pai> createdTehai) { // 手牌を並べて表示する (ちょっとGPTの力借りた)
        for (int key = 1; key <= 13; key++) {
            for (int j = 0; j < 14; j++) {
                if (createdTehai.get(j).getKey() == key) {
                    System.out.print(createdTehai.get(j) + " ");
                }
            }
        }

        System.out.println();
    }

    public List<Pai> drawPai(List<Pai> removedTehai, List<Pai> shuffledYama) { // 牌を山から引く(ここの設計ダメ)
        removedTehai.add(shuffledYama.get(0));
        List<Pai> createdTehai = new ArrayList<>(removedTehai);
        return createdTehai;
    }

    public List<Pai> discardPai(List<Pai> createdTehai, Scanner scanner) { // 牌を捨てる
        System.out.println("捨てる牌を選んで下さい");
        String discardPai = scanner.nextLine().trim();

        for (int i = 0; i < createdTehai.size(); i++) {
            if (createdTehai.get(i).getPaiName().equals(discardPai)) {
                createdTehai.remove(i);
                List<Pai> removedTehai = new ArrayList<>(createdTehai);
                return removedTehai;
            }
        }
        System.out.println("正しい牌を入力してください");
        return createdTehai;
    }
}