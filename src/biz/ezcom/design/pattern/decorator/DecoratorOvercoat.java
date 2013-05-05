package biz.ezcom.design.pattern.decorator;

/**
 * 具体组件的装饰器: 外套
 */
public final class DecoratorOvercoat extends AbstractDecorator {
    public DecoratorOvercoat() {}

    @Override()
    public void bath() {
        System.out.println("外套脱掉了...");
        if (this.getComponent() != null) {
            this.getComponent().bath();
        }
        System.out.println("外套穿上了...");
    }
}
