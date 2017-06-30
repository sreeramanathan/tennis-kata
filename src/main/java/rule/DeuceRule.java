package rule;

import model.Player;

public class DeuceRule implements Rule {
    public String summarizeScore(Player player1, Player player2, String score) {
        if (player1.getScore().equals(player2.getScore()) && player1.getScore().atleastThreePoints()) {
            return "Deuce";
        }
        return score;
    }
}
