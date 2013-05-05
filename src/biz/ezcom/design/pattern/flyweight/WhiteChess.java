package biz.ezcom.design.pattern.flyweight;

/**
 * 围棋白棋
 */
public class WhiteChess extends AbstractChess {
    public WhiteChess() {
        super("white");
        System.out.println("new WhiteChess()");
    }
}
