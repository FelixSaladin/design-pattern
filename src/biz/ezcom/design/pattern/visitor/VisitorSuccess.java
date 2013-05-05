package biz.ezcom.design.pattern.visitor;

/**
 * 访问者：成功时
 */
public final class VisitorSuccess implements IVisitor {
    public VisitorSuccess() {}

    @Override()
    public void doPerson(final PersonMan man) {
        System.out.println("男人成功时，妻妾成群");
    }

    @Override()
    public void doPerson(final PersonWoman woman) {
        System.out.println("女人成功时，孤独一生");
    }
}
