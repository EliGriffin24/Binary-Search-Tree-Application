public class Player {
    String name;
    int score;
    String initials;
    int plays;

    public Player() {
        name = "";
        score = 0;
        initials = "";
        plays = 0;
    }

    public Player(String name, int score, String initials, int plays) {
        this.name = name;
        this.score = score;
        this.initials = initials;
        this.plays = plays;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-5d %-3s %-5d", name, score, initials, plays);
                // Individual Lines:
                /*
                ("Name: " + name + "\n" +
                "Score: " + score + "\n" +
                "Initials: " + initials + "\n" + 
                "# of Plays: " + plays);
                */ 
    }
}