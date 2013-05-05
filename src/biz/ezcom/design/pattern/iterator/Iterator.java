package biz.ezcom.design.pattern.iterator;

/** 真实的迭代器 */
public final class Iterator implements IIterator {
    /** 集合 */
    private final Aggregate aggregate;
    /** 当前下标 */
    private int             current = 0;

    public Iterator(final Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override()
    public Object next() {
        Object ret = null;
        if (this.current < this.aggregate.getCount()) {
            ret = this.aggregate.getItem(this.current);
        }
        this.current++;
        return ret;
    }

    @Override()
    public boolean hasNext() {
        return this.current < this.aggregate.getCount();
    }
}
