package biz.ezcom.design.pattern.memento;

/**
 * 游戏运行类
 */
public final class OriginatorGame {
    /** 游戏状态 */
    private State state;

    public OriginatorGame(final State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    /**
     * 保存进度
     */
    public Memento saveMemento() {
        final State save = (State) this.state.clone();
        return new Memento(save);
    }

    /**
     * 加载进度
     */
    public void loadMemento(final Memento memento) {
        this.setState(memento.getState());
    }

    /**
     * 显示状态
     */
    public void show() {
        System.out.println(this.getState());
    }

    /**
     * 玩游戏
     */
    public void play() {
        System.out.println("正在完游戏");
        final int attack = 10;
        this.state.setAttack(this.state.getAttack() - attack);
        final int defense = 10;
        this.state.setDefense(this.state.getDefense() - defense);
        final int vitality = 10;
        this.state.setVitality(this.state.getVitality() - vitality);
        System.out.println("攻击力：" + this.state.getAttack());
        System.out.println("防御力：" + this.state.getDefense());
        System.out.println("生命值：" + this.state.getVitality());
    }
}
