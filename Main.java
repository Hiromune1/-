import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();

        gameManager.putPaiTypes();

        Yama yama = new Yama();
        yama.createPai(gameManager);
        yama.shuffleYama();

        Player player = new Player();
        player.createTehai(yama);
        while (true) {
            boolean isAgari = player.tumoMovement(gameManager, yama);
            if (isAgari) {
                System.out.println("ゲーム終了！");
                break;
            }
        }

    }
}
