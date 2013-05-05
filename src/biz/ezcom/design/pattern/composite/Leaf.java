package biz.ezcom.design.pattern.composite;

/**
 * 不能包含子元素的组件
 */
public final class Leaf extends AbstractComposite {
    public Leaf(final int level, final String name) {
        super(level, name);
    }

    @Override()
    public void add(final AbstractComposite composite) {
        System.out.println("叶子节点add空实现");
    }

    @Override()
    public void remove(final AbstractComposite composite) {
        System.out.println("叶子节点remove空实现");
    }

    @Override()
    public void show() {
        for (int i = 0; i < this.getLevel(); i++) {
            System.out.print("\t");
        }
        System.out.println(this.getName());
    }
}
