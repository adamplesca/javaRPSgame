public class gameFunctions {
    
    private int playerWon, botWon ,tie;
    private int totalPlayerWins, totalBotWins, totalTies;
    private String playerAnswer, result;


    public gameFunctions(){
        playerWon = 0;
        botWon = 0;
        tie = 0;

        totalPlayerWins = 0;
        totalBotWins = 0;
        totalTies = 0;

        playerAnswer = " ";
        result = " ";
    }


    //set + get player ans
    public void setAnswer(String playerAnswer){
        this.playerAnswer = playerAnswer;
    }
    public String getAnswer(){
        return playerAnswer;
    }

    //calculates who won  //TODO calculate who won, give answer + track W/L/T
    public void winCalc(){
        if(playerAnswer.equals(bot.getBotMove()) )
    }

    public int returnWinner(){
        return 0;
    }

}
