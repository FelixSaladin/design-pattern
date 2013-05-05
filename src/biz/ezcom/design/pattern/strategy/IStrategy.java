package biz.ezcom.design.pattern.strategy;

/**
 * 打折策略抽象
 */
public interface IStrategy {
    /** 根据商品金额获得需要支付的金额 */
    double getResult(double cash);
}
