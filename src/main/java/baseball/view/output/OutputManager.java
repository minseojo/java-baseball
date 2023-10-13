package baseball.view.output;

public interface OutputManager {
    void gameStartMessage();
    void userInputPromptMessage();
    void gameWinMessage();
    void gameEndPrompt();
    void gameResult(String result);
    void errorMessage(String message);

}
