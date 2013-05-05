package biz.ezcom.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 能包含子元素的组件
 */
public final class Component extends AbstractComposite {
    /** 组件集合 */
    private final List<AbstractComposite> list = new ArrayList<AbstractComposite>();

    public Component(final int level, final String name) {
        super(level, name);
    }

    @Override()
    public void add(final AbstractComposite company) {
        this.list.add(company);
    }

    @Override()
    public void remove(final AbstractComposite company) {
        this.list.remove(company);
    }

    @Override()
    public void show() {
        for (int i = 0; i < this.getLevel(); i++) {
            System.out.print("\t");
        }
        System.out.println(this.getName() + ":");
        for (final AbstractComposite company : this.list) {
            company.show();
        }
    }
}
