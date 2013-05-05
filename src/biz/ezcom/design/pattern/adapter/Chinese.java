package biz.ezcom.design.pattern.adapter;

/**
 * 要适配的对象中国人类
 */
public final class Chinese implements IChinese {
    public Chinese() {}

    @Override()
    public void speckChinese() {
        System.out.println("说中文");
    }
}
