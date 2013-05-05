package biz.ezcom.design.pattern.memento;

/**
 * 游戏要保存的进度类（备忘录）
 */
public final class Memento {
    /** 状态 */
    private State state;

    public Memento(final State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
