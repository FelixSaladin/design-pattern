package biz.ezcom.design.pattern.factory.simple;

/** 客户端 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final double numberA = 12.34;
        final double numberB = 2;
        IOperator operator = Factory.newInstance("+");
        double result = operator.getResult(numberA, numberB);
        System.out.println(result);
        operator = Factory.newInstance("-");
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
        operator = Factory.newInstance("*");
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
        operator = Factory.newInstance("/");
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
    }
}
