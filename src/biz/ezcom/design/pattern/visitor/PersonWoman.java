package biz.ezcom.design.pattern.visitor;

/**
 * 人的继承：女人
 */
public final class PersonWoman implements IPerson {
    public PersonWoman() {}

    @Override()
    public void accept(final IVisitor visitor) {
        visitor.doPerson(this);
    }
}
