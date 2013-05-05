package biz.ezcom.design.pattern.commond;

/**
 * 具体命令类：烤鸡翅
 */
public final class CommondBakeChickenWing implements ICommond {
    /** 厨师 */
    private final ReceiverBarbecuer barbecuer;

    public CommondBakeChickenWing(final ReceiverBarbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override()
    public void executeCommond() {
        this.barbecuer.bakeChickenWing();
    }
}
