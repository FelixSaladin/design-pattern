package biz.ezcom.design.pattern.flyweight;

/**
 * 围棋棋子抽象类
 */
public abstract class AbstractChess {
    /** 围棋的颜色 */
    private final String color;

    protected AbstractChess(final String color) {
        this.color = color;
    }

    public final String getColor() {
        return this.color;
    }

    public final void display(final int x, final int y) {
        System.out.println(this.getColor() + " : " + "(" + x + ", " + y + ")");
    }
}
