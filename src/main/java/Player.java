public class Player {
    private String name;
    private Score score;

    Player(String name) {
        this.name = name;
        this.score = new Score();
    }

    public void wonPoint() {
        score.wonPoint();
    }

    public Score getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
