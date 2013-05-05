package biz.ezcom.design.pattern.memento;

/**
 * 游戏中，角色的状态
 */
public final class State implements Cloneable {
    /** 攻击力 */
    private int attack;
    /** 防御力 */
    private int defense;
    /** 生命力 */
    private int vitality;

    public State(final int attack, final int defense, final int vitality) {
        this.attack = attack;
        this.defense = defense;
        this.vitality = vitality;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(final int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(final int defense) {
        this.defense = defense;
    }

    public int getVitality() {
        return this.vitality;
    }

    public void setVitality(final int vitality) {
        this.vitality = vitality;
    }

    @Override()
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (final CloneNotSupportedException e) {
            final State state = new State(this.getAttack(), this.getDefense(), this.getVitality());
            object = state;
        }
        return object;
    }

    @Override()
    public String toString() {
        return "攻击力：" + this.getAttack() + "\n防御力：" + this.getDefense() + "\n生命值：" + this.getVitality() + "\n";
    }
}
