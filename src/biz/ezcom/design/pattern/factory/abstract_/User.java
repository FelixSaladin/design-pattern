package biz.ezcom.design.pattern.factory.abstract_;

/**
 * 用户
 */
public final class User {
    /** 唯一标识符 */
    private int    id;
    /** 用户名 */
    private String name;

    public User() {}

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
