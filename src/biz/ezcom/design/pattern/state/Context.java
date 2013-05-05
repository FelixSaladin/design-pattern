package biz.ezcom.design.pattern.state;

/**
 * 环境类
 */
public final class Context {
    /** 状态 */
    private IState state;
    /** 当前几点 */
    private int    hour;

    public Context() {}

    public Context(final IState state, final int hour) {
        this.state = state;
        this.hour = hour;
    }

    public IState getState() {
        return this.state;
    }

    public void setState(final IState state) {
        this.state = state;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(final int hour) {
        this.hour = hour;
    }

    public void request() {
        this.state.handle(this);
    }
}
