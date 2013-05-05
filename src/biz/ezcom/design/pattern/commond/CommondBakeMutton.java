package biz.ezcom.design.pattern.commond;

/**
 * 具体命令类：烤肉串
 */
public final class CommondBakeMutton implements ICommond {
    /** 厨师 */
    private final ReceiverBarbecuer barbecuer;

    public CommondBakeMutton(final ReceiverBarbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override()
    public void executeCommond() {
        this.barbecuer.bakeMutton();
    }
}
