package biz.ezcom.design.pattern.facade;

/**
 * 基金类
 * 股票与债券都是很专业的，表示内部很繁杂
 * 由基金来操作股票与债券，基金就是股票与债券的外观
 */
public final class FoundationFacade {
    /** 股票 */
    private final Stock stock = new Stock();
    /** 债券 */
    private final Bond  bond  = new Bond();

    public FoundationFacade() {}

    public void operation() {
        this.stock.operation();
        this.bond.operation();
    }
}
