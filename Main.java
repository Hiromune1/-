import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        GameManager gm = new GameManager(); // review: 先頭を小文字にしたgameManagerの方がいい
=======
        GameManager gameManager = new GameManager();
>>>>>>> fce2a3b (Playerクラスらを改善)

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
<<<<<<< HEAD
        /* 
            review:
            今の書き方だと、playerインスタンスを用意しているにもかかわらず、手札をcreatedTehaiの配列で管理している。
            そのため、一つしか管理できない(将来的に複数ユーザにした時に困る)＋playerインスタンスを作成した意味があまりない
            理想としてはPlayer.tehaiで手牌を管理する、showTehaiやdiscardPaiなどの引数に現在の牌を渡さず、
            関数内でthis.tehaiを呼び出して自己完結するようにする。
        */
        List<Pai> createdTehai = player.createTehai(shuffledYama);
        player.showTehai(createdTehai);

        Scanner scanner = new Scanner(System.in);   // review:各場所で定義でわざわざ引数で渡さなくていい

        List<Pai> removedTehai = player.discardPai(createdTehai, scanner);

        createdTehai = player.drawPai(removedTehai, shuffledYama);
        player.showTehai(createdTehai);
=======
        player.createTehai(shuffledYama);
        player.showTehai();

        player.discardPai();

        player.drawPai(shuffledYama);

>>>>>>> fce2a3b (Playerクラスらを改善)
    }

}
