package biz.ezcom.design.pattern.factory.method;

/**
 * 减法操作工厂
 */
public final class FactorySub implements IFactory {
    public FactorySub() {}

    @Override()
    public IOperator createOperator() {
        return new OperatorSub();
    }
}
