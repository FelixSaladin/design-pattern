package biz.ezcom.design.pattern.factory.method;

/**
 * 乘法操作工厂
 */
public final class FactoryMul implements IFactory {
    public FactoryMul() {}

    @Override()
    public IOperator createOperator() {
        return new OperatorMul();
    }
}
