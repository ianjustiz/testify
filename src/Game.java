import java.util.ArrayList;

public class Game {
    
    final int MAX_PLAYERS = 100;
    
    private int game_code;

    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<Player> players = new ArrayList<Player>(MAX_PLAYERS);
    private int length_seconds;
    //private int max_participants;

    public Game(int length_seconds) {
        this.length_seconds = length_seconds;
        generateGameCode();
    }

    public void generateGameCode() {
        game_code = (int) (Math.random() * 10000) + 1000;
    }

    public void addQuestion(String input) throws Exception {
        // throws exception when invalid characters are typed
        
        questions.add(new Question(input));
    }

    public void kickPlayer(int player_id) {
        //this.players.removeIf(player -> player.getId() == player_id);
        players.remove(player_id);
    }

    public void addPlayer(String player_name) {
        players.add(new Player(player_name));
    }
}