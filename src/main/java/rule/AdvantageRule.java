package rule;

import model.Player;

public class AdvantageRule implements Rule {
    public String summarizeScore(Player player1, Player player2, String score) {
        if (player1.getScore().advantageOver(player2.getScore())) {
            return "Advantage " + player1.getName();
        }
        if (player2.getScore().advantageOver(player1.getScore())) {
            return "Advantage " + player2.getName();
        }
        return score;
    }
}
