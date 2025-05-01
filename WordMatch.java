public class WordMatch{
    private String secret;

    public WordMatch(String word){
        secret = word;

    }

    public int scoreGuess(String guess){
        int score = 0;
        int count = 0;
        int guesslen = guess.length();
        for(int i = 0; i <= secret.length() - guesslen; i++){
            if((secret.substring(i, i + guesslen).equals(guess))) count++;
        }
        score = count * (guesslen) * (guesslen);
        return score;

    }

    public String findBetterGuess(String guess1, String guess2){
        int score1 = this.scoreGuess(guess1);
        int score2 = this.scoreGuess(guess2);
        if(score1 > score2) return guess1;
        if(score2 > score1) return guess2;
        if(guess1.compareTo(guess2) > 0) return guess1;
        return guess2;
    }
    
}