//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getUserInput();

        WordAndLetterProcessor count = new WordAndLetterProcessor(input);
        System.out.println(count);
    }
}