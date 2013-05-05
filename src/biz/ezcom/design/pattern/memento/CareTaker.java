package biz.ezcom.design.pattern.memento;

/**
 * 备忘录的管理者
 */
public final class CareTaker {
    /** 备忘录 */
    private Memento memento;

    public CareTaker(final Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(final Memento memento) {
        this.memento = memento;
    }
}
