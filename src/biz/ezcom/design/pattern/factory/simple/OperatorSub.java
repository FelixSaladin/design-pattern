package biz.ezcom.design.pattern.factory.simple;

/**
 * 减法操作
 */
public final class OperatorSub implements IOperator {
    public OperatorSub() {}

    @Override()
    public double getResult(final double numberA, final double numberB) {
        return numberA - numberB;
    }
}
