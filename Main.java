import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameManager gm = new GameManager();

        Map<Integer, String> paiTypes = new HashMap<Integer, String>();
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

        gm.createYama();
        List<Pai> addedYama = gm.createPai(paiTypes);
        List<Pai> shuffledYama = gm.shuffleYama(addedYama);

        Player player = new Player();
        List<Pai> createdTehai = player.createTehai(shuffledYama);
        player.showTehai(createdTehai);

        Scanner scanner = new Scanner(System.in);

        List<Pai> removedTehai = player.discardPai(createdTehai, scanner);

        player.drawPai(removedTehai, shuffledYama);

    }

}
