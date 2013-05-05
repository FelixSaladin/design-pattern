package biz.ezcom.design.pattern.adapter;

/**
 * 现在要在美国人与中国人之间，加个翻译，使美国人说美语，中国人也能听懂
 * 这个适配器类与目标类有相同的接口
 */
public final class AdapterTransactor implements IAmerican {
    /** 中国人 */
    private final IChinese chinese;

    public AdapterTransactor(final IChinese chinese) {
        this.chinese = chinese;
    }

    @Override()
    public void speckAmerican() {
        this.chinese.speckChinese();
    }
}
