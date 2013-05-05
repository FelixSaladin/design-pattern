package biz.ezcom.design.pattern.proxy.statics;

/**
 * 追求者
 */
public final class Boy implements IGiveGift {
    public Boy() {}

    @Override()
    public void giveFlower(final Girl girl) {
        System.out.println("送花 to " + girl.getName());
    }

    @Override()
    public void giveChocolate(final Girl girl) {
        System.out.println("送巧克力 to " + girl.getName());
    }
}
