package rule;

import model.Player;

public class WinRule implements Rule {
    public String summarizeScore(Player player1, Player player2, String score) {
        if (player1.getScore().winOver(player2.getScore())) {
            return "Win for " + player1.getName();
        }
        if (player2.getScore().winOver(player1.getScore())) {
            return "Win for " + player2.getName();
        }
        return score;
    }
}
