package biz.ezcom.design.pattern.prototype;

import java.util.Date;

/**
 * 深克隆
 */
public final class PrototypeDeep implements Cloneable {
    /** 姓名 */
    private String name;
    /** 日期 */
    private Date   date;

    public PrototypeDeep(final String name, final Date date) {
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
    public Object clone() throws CloneNotSupportedException {
        // String 可看作原始类型
        // 引用类型重新 new
        final PrototypeDeep deep = (PrototypeDeep) super.clone();
        deep.setName(this.getName());
        deep.setDate(new Date(this.getDate().getTime()));
        return deep;
    }
}
