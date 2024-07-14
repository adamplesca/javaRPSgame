import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class botPlayer {
    
    private ArrayList<String> botMoves = new ArrayList<>(Arrays.asList("rock", "paper", "scissors"));

    public String getBotMove() {
        ArrayList<String> shuffledMoves = new ArrayList<>(botMoves);
        Collections.shuffle(shuffledMoves);
        return shuffledMoves.get(0); 
    }

    //TODO, maybe a smarter way to code something for gameFunc
}
