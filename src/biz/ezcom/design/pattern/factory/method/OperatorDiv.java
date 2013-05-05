package biz.ezcom.design.pattern.factory.method;

/**
 * 除法操作
 */
public final class OperatorDiv implements IOperator {
    public OperatorDiv() {}

    @Override()
    public double getResult(final double numberA, final double numberB) {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为０");
        }
        return numberA / numberB;
    }
}
