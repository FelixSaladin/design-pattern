package biz.ezcom.design.pattern.composite;

/**
 * 所有组件抽象
 */
public abstract class AbstractComposite {
    /** 树形的层次 */
    private int    level;
    /** 名称 */
    private String name;

    public AbstractComposite(final int level, final String name) {
        this.level = level;
        this.name = name;
    }

    public final int getLevel() {
        return this.level;
    }

    public final void setLevel(final int level) {
        this.level = level;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public abstract void add(AbstractComposite composite);

    public abstract void remove(AbstractComposite composite);

    public abstract void show();
}
