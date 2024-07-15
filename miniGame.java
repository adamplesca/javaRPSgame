import javax.swing.JOptionPane;

public class miniGame{
    public static void main(String[] args) {
        
        String playerAnswer;

        botPlayer bot = new botPlayer();
        gameFunctions gameFunc = new gameFunctions();

        playerAnswer = JOptionPane.showInputDialog(null, "Welcome to Rock Paper Scissors, Write your answer below and see if you win.");
        gameFunc.setAnswer(playerAnswer);

        bot.getBotMove();
        gameFunc.winCalc();

        //JOptionPane.showMessageDialog(null, "You" + result "!"); 

    }
}