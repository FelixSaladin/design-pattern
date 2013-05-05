package biz.ezcom.design.pattern.factory.method;

/**
 * 加法操作
 */
public final class OperatorAdd implements IOperator {
    public OperatorAdd() {}

    @Override()
    public double getResult(final double numberA, final double numberB) {
        return numberA + numberB;
    }
}
