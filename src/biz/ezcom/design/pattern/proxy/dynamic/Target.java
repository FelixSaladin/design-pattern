package biz.ezcom.design.pattern.proxy.dynamic;

/**
 * 代理的目标实现
 */
public final class Target implements ITarget {
    public Target() {}

    @Override()
    public void operation() {
        System.out.println("Target.operation()");
    }
}
