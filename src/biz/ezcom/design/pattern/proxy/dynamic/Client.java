package biz.ezcom.design.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final ITarget target = new Target();
        final ProxyHandler handler = new ProxyHandler(target);
        final ITarget proxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        proxy.operation();
    }
}
