package rule;

import model.Player;

public interface Rule {
    String summarizeScore(Player player1, Player player2, String score);
}
