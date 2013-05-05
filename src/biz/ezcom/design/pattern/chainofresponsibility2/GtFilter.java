package biz.ezcom.design.pattern.chainofresponsibility2;

/**
 * html 转义 >
 */
public final class GtFilter implements IFilter {
    public GtFilter() {}

    @Override()
    public String doFilter(final String msg) {
        return msg.replaceAll(">", "&gt;");
    }
}
