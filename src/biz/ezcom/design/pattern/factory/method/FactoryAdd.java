package biz.ezcom.design.pattern.factory.method;

/**
 * 加法操作工厂
 */
public final class FactoryAdd implements IFactory {
    public FactoryAdd() {}

    @Override()
    public IOperator createOperator() {
        return new OperatorAdd();
    }
}
