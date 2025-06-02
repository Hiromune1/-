import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        Map<Integer, String> paiTypes = new HashMap<Integer, String>();
        // review:長いからどこかで関数化してもいいかもね
        paiTypes.put(1, "一萬");
        paiTypes.put(2, "九萬");
        paiTypes.put(3, "1筒");
        paiTypes.put(4, "9筒");
        paiTypes.put(5, "1索");
        paiTypes.put(6, "9索");
        paiTypes.put(7, "東");
        paiTypes.put(8, "南");
        paiTypes.put(9, "西");
        paiTypes.put(10, "北");
        paiTypes.put(11, "白");
        paiTypes.put(12, "發");
        paiTypes.put(13, "中");

        gameManager.createYama();
        List<Pai> addedYama = gameManager.createPai(paiTypes);
        List<Pai> shuffledYama = gameManager.shuffleYama(addedYama);

        Player player = new Player();
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        player.createTehai(shuffledYama);
        player.showTehai();

        player.discardPai();

        player.drawPai(shuffledYama);
=======
        player.createTehai(shuffledYama); // 山から14枚持ってきて手牌つくる
        player.showTehai(); // 手牌表示
>>>>>>> Stashed changes
=======
        player.createTehai(shuffledYama); // 山から14枚持ってきて手牌つくる
        player.showTehai(); // 手牌表示
>>>>>>> Stashed changes

    }

}
