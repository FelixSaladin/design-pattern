package biz.ezcom.design.pattern.flyweight;

/**
 * 围棋黑棋
 */
public class BlackChess extends AbstractChess {
    public BlackChess() {
        super("black");
        System.out.println("new BlackChess()");
    }
}
