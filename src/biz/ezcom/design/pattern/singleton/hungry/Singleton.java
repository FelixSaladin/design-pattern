package biz.ezcom.design.pattern.singleton.hungry;

/**
 * 饿汉式
 */
public final class Singleton {
    /** 单一实例 */
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}
