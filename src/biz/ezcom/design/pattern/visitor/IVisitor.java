package biz.ezcom.design.pattern.visitor;

/**
 * 访问者
 */
public interface IVisitor {
    /**
     * 男人分支
     */
    void doPerson(PersonMan man);

    /**
     * 女人分支
     */
    void doPerson(PersonWoman woman);
}
