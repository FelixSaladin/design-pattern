package biz.ezcom.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理类
 */
public final class ProxyHandler implements InvocationHandler {
    /** 代理的目标 */
    private final Object target;

    public ProxyHandler(final Object target) {
        this.target = target;
    }

    @Override()
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Exception {
        System.out.println(method.getName() + "() before");
        final Object result = method.invoke(this.target, args);// 目标方法调用
        System.out.println(method.getName() + "() after");
        return result;
    }
}
