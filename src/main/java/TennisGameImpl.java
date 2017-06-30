import model.Player;
import model.Players;
import rule.*;

import java.util.Arrays;
import java.util.List;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    private List<Rule> rules;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = Players.create(player1Name);
        this.player2 = Players.create(player2Name);
        this.rules = Arrays.asList(new DeuceRule(), new EqualsRule(), new AdvantageRule(), new WinRule());
    }

    public void wonPoint(String playerName) {
        Players.get(playerName).wonPoint();
    }

    public String getScore() {
        String score = player1.getScore().toString() + "-" + player2.getScore().toString();

        for (Rule rule : this.rules) {
            score = rule.summarizeScore(player1, player2, score);
        }

        return score;
    }
}
