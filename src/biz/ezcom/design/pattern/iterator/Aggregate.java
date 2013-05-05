package biz.ezcom.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/** 真实的集合 */
public final class Aggregate implements IAggregate {
    /** 真实的集合 */
    private final List<Object> items = new ArrayList<Object>();

    public Aggregate() {}

    @Override()
    public IIterator createIterator() {
        return new Iterator(this);
    }

    public int getCount() {
        return this.items.size();
    }

    public Object getItem(final int index) {
        return this.items.get(index);
    }

    public void add(final Object item) {
        this.items.add(item);
    }
}
