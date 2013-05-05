package biz.ezcom.design.pattern.flyweight;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final String black = "black";
        final String white = "white";
        // 围棋中{(4,4), (4,16), (16,4), (16,16)}是4个星
        final int x = 4;
        final int y = 16;
        final ChessFactory factory = ChessFactory.getInstance();
        System.out.println("围棋开始...");
        factory.getChess(black).display(x, x);
        factory.getChess(white).display(y, x);
        factory.getChess(black).display(x, y);
        factory.getChess(white).display(y, y);
        System.out.println("四星被占");
    }
}
