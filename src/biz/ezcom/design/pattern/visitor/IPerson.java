package biz.ezcom.design.pattern.visitor;

/**
 * 人
 */
public interface IPerson {
    /**
     * 接受访问者
     */
    void accept(IVisitor visitor);
}
