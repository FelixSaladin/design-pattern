package biz.ezcom.design.pattern.strategy;

/**
 * 打折策略：不打折
 */
public final class StrategyNormal implements IStrategy {
    /** 打折策略类型 */
    public static final String STRATEGY_TYPE = "normal";

    public StrategyNormal() {}

    @Override()
    public double getResult(final double cash) {
        return cash;
    }
}
