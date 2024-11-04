import java.util.HashMap;
import java.util.StringTokenizer;

public class WordAndLetterProcessor {
    private String input;
    private HashMap<String, Integer> wordCount;
    private HashMap<Character, Integer> letterCount;

    public WordAndLetterProcessor(String input) {
        this.input = input;
        this.wordCount = new HashMap<>();
        this.letterCount = new HashMap<>();
        processInput();
    }

    private void processInput() {
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

            for(char c : word.toCharArray()) {
                if(Character.isLetter(c)) {
                    letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Word Count: " + wordCount + "\nLetter Count: " + letterCount;
    }


}
