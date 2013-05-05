package biz.ezcom.design.pattern.chainofresponsibility2;

/**
 * html 转义 <
 */
public final class LtFilter implements IFilter {
    public LtFilter() {}

    @Override()
    public String doFilter(final String msg) {
        return msg.replaceAll("<", "&lt;");
    }
}
