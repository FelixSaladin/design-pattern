package biz.ezcom.design.pattern.strategy;

/**
 * 打折策略：按条件返现金策略
 */
public final class StrategyReturn implements IStrategy {
    /** 打折策略类型 */
    public static final String STRATEGY_TYPE = "return";
    /** 满足条件 */
    private final double       conditionMoney;
    /** 返回金额 */
    private final double       returnMoney;

    public StrategyReturn(final double conditionMoney, final double returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override()
    public double getResult(final double cash) {
        final double multiple = Math.floor(cash / this.conditionMoney);
        return cash - this.returnMoney * multiple;
    }
}
