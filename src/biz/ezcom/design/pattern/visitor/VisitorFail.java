package biz.ezcom.design.pattern.visitor;

/**
 * 访问者：失败
 */
public final class VisitorFail implements IVisitor {
    public VisitorFail() {}

    @Override()
    public void doPerson(final PersonMan man) {
        System.out.println("男人失败时，孤独一生");
    }

    @Override()
    public void doPerson(final PersonWoman woman) {
        System.out.println("女人失败时，相守一生");
    }
}
