package biz.ezcom.design.pattern.decorator;

/**
 * 具体组件的装饰器: 内衣
 */
public final class DecoratorUnderwear extends AbstractDecorator {
    public DecoratorUnderwear() {}

    @Override()
    public void bath() {
        System.out.println("内衣脱掉了...");
        if (this.getComponent() != null) {
            this.getComponent().bath();
        }
        System.out.println("内衣穿上了...");
    }
}
