package biz.ezcom.design.pattern.interpreter;

/** 环境上下文 */
public final class Context {
    /** 密文 */
    private String playText;

    public Context() {}

    public String getPlayText() {
        return this.playText;
    }

    public void setPlayText(final String playText) {
        this.playText = playText;
    }
}
