import java.util.HashMap;
import java.util.Map;

public class Players {
    private static Map<String, Player> players = new HashMap<String, Player>();

    public static Player create(String name) {
        Player player = new Player(name);
        players.put(name, player);
        return player;
    }

    public static Player get(String name) {
        return players.get(name);
    }
}
