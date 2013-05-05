package biz.ezcom.design.pattern.strategy;

/**
 * 商场打折环境类
 */
public final class Context {
    /** 打折策略 */
    private final IStrategy strategy;

    public Context(final String type) {
        if (StrategyNormal.STRATEGY_TYPE.equals(type)) {
            this.strategy = new StrategyNormal();// 正常不打折
        } else if (StrategyRebate.STRATEGY_TYPE.equals(type)) {
            final double rebate = 0.8D;
            this.strategy = new StrategyRebate(rebate);// 打８折
        } else if (StrategyReturn.STRATEGY_TYPE.equals(type)) {
            final double conditionMoney = 300D;
            final double returnMoney = 100D;
            this.strategy = new StrategyReturn(conditionMoney, returnMoney);// 满300返100
        } else {
            throw new RuntimeException("没有这种打折策略");
        }
    }

    public double getResultCash(final double cash) {
        return this.strategy.getResult(cash);
    }
}
