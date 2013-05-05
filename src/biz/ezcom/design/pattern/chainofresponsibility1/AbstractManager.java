package biz.ezcom.design.pattern.chainofresponsibility1;

/**
 * 管理者类抽象
 */
public abstract class AbstractManager {
    /** 姓名 */
    private String          name;
    /** 管理者 */
    private AbstractManager manager;

    public AbstractManager() {}

    public final String getName() {
        return this.name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final AbstractManager getManager() {
        return this.manager;
    }

    public final void setManager(final AbstractManager manager) {
        this.manager = manager;
    }

    public abstract void handler(Request request);
}
