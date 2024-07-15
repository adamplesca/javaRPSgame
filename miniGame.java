import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class miniGame {
    public static void main(String[] args) {
        
        String playerAnswer;
        int playAgain;

        List<String> validAnswers = Arrays.asList("rock", "paper", "scissors");
        gameFunctions gameFunc = new gameFunctions();

        do {
            do {
                playerAnswer = JOptionPane.showInputDialog(null, "Welcome to Rock Paper Scissors. Write your answer below (rock, paper, or scissors) and see if you win.");
                if (playerAnswer != null) {
                    playerAnswer = playerAnswer.toLowerCase();
                }
                if (!validAnswers.contains(playerAnswer)) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter 'rock', 'paper', or 'scissors'.");
                }
            } while (!validAnswers.contains(playerAnswer));

            gameFunc.setAnswer(playerAnswer);
            gameFunc.winCalc();

            JOptionPane.showMessageDialog(null,  "\n" + "Your move was: " + playerAnswer
                                              + "\n" + "The bot's move was: " + gameFunc.returnBotMove()
                                              + "\n" + gameFunc.returnWinner()
                                              + "\nTotal Player Wins: " + gameFunc.returnPlayerWins()
                                              + "\nTotal Bot Wins: " + gameFunc.returnBotWins()
                                              + "\nTotal Ties: " + gameFunc.returnTotalTies());

            playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
        } while (playAgain == JOptionPane.YES_OPTION);
    }
}