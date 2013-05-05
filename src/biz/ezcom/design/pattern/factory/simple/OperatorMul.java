package biz.ezcom.design.pattern.factory.simple;

/**
 * 乘法操作
 */
public final class OperatorMul implements IOperator {
    public OperatorMul() {}

    @Override()
    public double getResult(final double numberA, final double numberB) {
        return numberA * numberB;
    }
}
