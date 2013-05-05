package biz.ezcom.design.pattern.strategy;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final double money = 1000D;
        // 不打折
        final Context contextNormal = new Context(StrategyNormal.STRATEGY_TYPE);
        final double resultNormal = contextNormal.getResultCash(money);
        System.out.println("normal: " + resultNormal);
        // 打８折
        final Context contextRebate = new Context(StrategyRebate.STRATEGY_TYPE);
        final double resultRebate = contextRebate.getResultCash(money);
        System.out.println("rebate: " + resultRebate);
        // 满300返100
        final Context contextReturn = new Context(StrategyReturn.STRATEGY_TYPE);
        final double resultReturn = contextReturn.getResultCash(money);
        System.out.println("return: " + resultReturn);
    }
}
