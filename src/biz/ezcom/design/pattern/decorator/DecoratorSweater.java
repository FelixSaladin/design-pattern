package biz.ezcom.design.pattern.decorator;

/**
 * 具体组件的装饰器: 毛衣
 */
public final class DecoratorSweater extends AbstractDecorator {
    public DecoratorSweater() {}

    @Override()
    public void bath() {
        System.out.println("毛衣脱掉了...");
        if (this.getComponent() != null) {
            this.getComponent().bath();
        }
        System.out.println("毛衣穿上了...");
    }
}
