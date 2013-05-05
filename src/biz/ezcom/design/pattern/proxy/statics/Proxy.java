package biz.ezcom.design.pattern.proxy.statics;

/**
 * 　追求者的代理
 */
public final class Proxy implements IGiveGift {
    /** 代理的target */
    private final Boy boy;

    public Proxy(final Boy boy) {
        this.boy = boy;
    }

    @Override()
    public void giveFlower(final Girl girl) {
        this.boy.giveFlower(girl);
    }

    @Override()
    public void giveChocolate(final Girl girl) {
        this.boy.giveChocolate(girl);
    }
}
