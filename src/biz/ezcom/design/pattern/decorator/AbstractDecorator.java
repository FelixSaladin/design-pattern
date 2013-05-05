package biz.ezcom.design.pattern.decorator;

/**
 * 抽象的组件
 */
public abstract class AbstractDecorator implements IComponent {
    /** 组件 */
    private IComponent component;

    public final IComponent getComponent() {
        return this.component;
    }

    public final void setComponent(final IComponent component) {
        this.component = component;
    }
}
