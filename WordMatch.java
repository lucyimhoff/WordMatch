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
    
}