public class GameStateManager {
    Stack<GameState> stack;

    public GameStateManager() {

    } 

    public void pushState(GameState state) {
        this.stack.push(state);
    } 

    public void popState() {
        this.stack.pop();
    }

    public GameState getCurrentState() {
        return this.stack.top();
    } 

    public void run() {
        this.getCurrentState().run(this);
    } 
} 
