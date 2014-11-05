package p3_interfaces;

/**
 * Created by Jack on 04.10.2014.
 */

interface Game{ boolean move(); }
interface GameFactory{ Game getGame(); }

class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move(){
        System.out.println("checkers move " + moves);
        return ++moves != MOVES;
    }
}
class CheckersFactory implements GameFactory {
    public Game getGame() { return new Checkers(); }
}
class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
class ChessFactory implements GameFactory {
    public Game getGame() { return new Chess(); }
}

public class FactoryGame {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while(s.move());
    }
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}