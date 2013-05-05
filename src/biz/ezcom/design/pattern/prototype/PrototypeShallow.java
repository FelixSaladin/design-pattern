package biz.ezcom.design.pattern.prototype;

import java.util.Date;

/**
 * 浅克隆
 */
public final class PrototypeShallow implements Cloneable {
    /** 姓名 */
    private String name;
    /** 日期 */
    private Date   date;

    public PrototypeShallow(final String name, final Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    @Override()
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
