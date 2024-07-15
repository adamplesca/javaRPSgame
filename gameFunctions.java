public class gameFunctions {

    private int totalPlayerWins, totalBotWins, totalTies;
    private String playerAnswer, result;
    private String botMove;

    botPlayer bot = new botPlayer();

    public gameFunctions(){
        totalPlayerWins = 0;
        totalBotWins = 0;
        totalTies = 0;

        playerAnswer = " ";
        result = " ";
    }


    //set + get player ans 
    public void setAnswer(String playerAnswer){
        this.playerAnswer = playerAnswer.toLowerCase();
    }
    public String getAnswer(){
        return playerAnswer;
    }

    //calculates who won
    public void winCalc(){
        botMove = bot.getBotMove();

        if(playerAnswer.equals(botMove)){
            totalTies += 1;
            result = "It's a tie";
        } else if(playerAnswer.equals("rock") && botMove.equals("scissors") ||
                  playerAnswer.equals("paper") && botMove.equals("rock") ||
                  playerAnswer.equals("scissors") && botMove.equals("paper")){
            totalPlayerWins += 1;
            result = "The Player wins";
        } else {
            totalBotWins += 1;
            result = "The Bot wins";
        }
    }

    //returns results/info to user
    public String returnWinner(){
        return result;
    }
    public int returnTotalTies(){
        return totalTies;
    }
    public int returnPlayerWins(){
        return totalPlayerWins;
    }
    public int returnBotWins(){
        return totalBotWins;
    }
    public String returnBotMove(){
        return botMove;
    }
}