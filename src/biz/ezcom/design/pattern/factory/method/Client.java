package biz.ezcom.design.pattern.factory.method;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final double numberA = 12.34;
        final double numberB = 2;
        IFactory factory = new FactoryAdd();
        IOperator operator = factory.createOperator();
        double result = operator.getResult(numberA, numberB);
        System.out.println(result);
        factory = new FactorySub();
        operator = factory.createOperator();
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
        factory = new FactoryMul();
        operator = factory.createOperator();
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
        factory = new FactoryDiv();
        operator = factory.createOperator();
        result = operator.getResult(numberA, numberB);
        System.out.println(result);
    }
}
