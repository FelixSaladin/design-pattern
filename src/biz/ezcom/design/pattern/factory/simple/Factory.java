package biz.ezcom.design.pattern.factory.simple;

/**
 * 运算操作的简单工厂
 */
public final class Factory {
    private Factory() {}

    public static IOperator newInstance(final String operate) {
        IOperator operatr = null;
        if ("+".equals(operate)) {
            operatr = new OperatorAdd();
        } else if ("-".equals(operate)) {
            operatr = new OperatorSub();
        } else if ("*".equals(operate)) {
            operatr = new OperatorMul();
        } else if ("/".equals(operate)) {
            operatr = new OperatorDiv();
        } else {
            throw new RuntimeException("不支持此操作符：" + operate);
        }
        return operatr;
    }
}
