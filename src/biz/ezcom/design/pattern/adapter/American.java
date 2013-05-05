package biz.ezcom.design.pattern.adapter;

/**
 * 要适配的目标美国人类
 */
public final class American implements IAmerican {
    public American() {}

    @Override()
    public void speckAmerican() {
        System.out.println("说英语");
    }
}
