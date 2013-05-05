package biz.ezcom.design.pattern.decorator;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final AbstractDecorator overcoat = new DecoratorOvercoat();
        final AbstractDecorator sweater = new DecoratorSweater();
        final AbstractDecorator underwear = new DecoratorUnderwear();
        final IComponent person = new Person("Felix");
        overcoat.setComponent(sweater);
        sweater.setComponent(underwear);
        underwear.setComponent(person);
        overcoat.bath();
    }
}
