package biz.ezcom.design.pattern.strategy;

/**
 * 打折策略：折扣
 */
public final class StrategyRebate implements IStrategy {
    /** 打折策略类型 */
    public static final String STRATEGY_TYPE = "rebate";
    /** 折扣率 */
    private final double       rebate;

    public StrategyRebate(final double rebate) {
        this.rebate = rebate;
    }

    @Override()
    public double getResult(final double cash) {
        return cash * this.rebate;
    }
}
