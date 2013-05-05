package biz.ezcom.design.pattern.visitor;

/**
 * 人的继承：男人
 */
public final class PersonMan implements IPerson {
    public PersonMan() {}

    @Override()
    public void accept(final IVisitor visitor) {
        visitor.doPerson(this);
    }
}
