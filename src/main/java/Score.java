public class Score {
    private int point;

    public void wonPoint() {
        point += 1;
    }

    @Override
    public String toString() {
        switch(point)
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Score && point == ((Score) obj).point;
    }

    @Override
    public int hashCode() {
        return point;
    }

    public boolean atleastThreePoints() {
        return point >= 3;
    }

    public boolean winOver(Score score) {
        return point > 3 && point - score.point >= 2;
    }

    public boolean advantageOver(Score score) {
        return point > 3 && point - score.point == 1;
    }
}
