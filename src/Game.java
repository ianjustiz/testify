import java.util.ArrayList;

public class Game {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int length_seconds;
    private int max_participants;


    public Game(int length_seconds, int max_participants) {
        this.length_seconds = length_seconds;
        this.max_participants = max_participants;
    }
}
