package biz.ezcom.design.pattern.singleton.lazy;

/**
 * 懒汉式
 */
public final class Singleton {
    /** 单一实例 */
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (Singleton.instance == null) {
            synchronized (Singleton.class) {
                // 双重判断
                if (Singleton.instance == null) {
                    Singleton.instance = new Singleton();
                }
            }
        }
        return Singleton.instance;
    }
}
