
public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = Players.create(player1Name);
        this.player2 = Players.create(player2Name);
    }

    public void wonPoint(String playerName) {
        Players.get(playerName).wonPoint();
    }

    public String getScore() {
        String score;

        if (player1.getScore().equals(player2.getScore())) {
            score = player1.getScore().atleastThreePoints()? "Deuce": player1.getScore().toString() + "-All";
        } else if (player1.getScore().winOver(player2.getScore())) {
            score = "Win for " + player1.getName();
        } else if (player2.getScore().winOver(player1.getScore())) {
            score = "Win for " + player2.getName();
        } else if (player1.getScore().advantageOver(player2.getScore())) {
            score = "Advantage " + player1.getName();
        } else if (player2.getScore().advantageOver(player1.getScore())) {
            score = "Advantage " + player2.getName();
        } else {
            score = player1.getScore().toString() + "-" + player2.getScore().toString();
        }

        return score;
    }
}
