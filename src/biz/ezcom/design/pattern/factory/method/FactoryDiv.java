package biz.ezcom.design.pattern.factory.method;

/**
 * 除法操作工厂
 */
public final class FactoryDiv implements IFactory {
    public FactoryDiv() {}

    @Override()
    public IOperator createOperator() {
        return new OperatorDiv();
    }
}
